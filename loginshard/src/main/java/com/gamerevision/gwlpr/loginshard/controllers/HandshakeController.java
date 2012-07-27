/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.loginshard.controllers;

import com.gamerevision.gwlpr.actions.loginserver.ctos.P1024_ClientVersionAction;
import com.gamerevision.gwlpr.actions.loginserver.ctos.P16896_ClientSeedAction;
import com.gamerevision.gwlpr.loginshard.model.logic.EncryptionDataHolder;
import com.gamerevision.gwlpr.loginshard.model.logic.HandshakeModel;
import com.gamerevision.gwlpr.loginshard.views.HandshakeView;
import com.realityshard.shardlet.EventHandler;
import com.realityshard.shardlet.GenericShardlet;
import com.realityshard.shardlet.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This shardlet handles the handshake process for GW clients.
 * It establishes an encrypted session.
 * 
 * @author _rusty
 */
public class HandshakeController extends GenericShardlet
{
    
    private static Logger LOGGER = LoggerFactory.getLogger(HandshakeController.class);
    private HandshakeView handshakeView;
    
    @Override
    protected void init() 
    {
        this.handshakeView = new HandshakeView(getShardletContext());
        
        LOGGER.debug("handshake shardlet initialized!");
    }
    
    
    @EventHandler
    public void clientVersionHandler(P1024_ClientVersionAction action)
    {
        LOGGER.debug("got the client version packet");
        
        int clientVersion = action.getUnknown2();
        
        // lets's ask the model to check the version for us
        if (!HandshakeModel.verifyClientVersion(clientVersion))
        {
            // create the sever seed out of the EncryptionData
            handshakeView.wrongClientVersion(action.getSession());
        }        
    }
    
    
    @EventHandler
    public void clientSeedHandler(P16896_ClientSeedAction action)
    {        
        LOGGER.debug("got the client seed packet");
        
        byte[] clientSeed = action.getClientSeed();
        
        // get the encryption data needed by the protocol filter
        EncryptionDataHolder data = HandshakeModel.getEncrpytionData(clientSeed);
        
        // create the server seed packet out of that and send it (indirectly)
        handshakeView.sendServerSeed(action.getSession(), data);
    }
}