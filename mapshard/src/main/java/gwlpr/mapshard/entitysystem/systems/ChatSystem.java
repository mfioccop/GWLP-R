/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.mapshard.entitysystem.systems;

import gwlpr.mapshard.entitysystem.GenericSystem;
import gwlpr.mapshard.entitysystem.Components.*;
import gwlpr.mapshard.events.ChatMessageEvent;
import gwlpr.mapshard.models.ClientLookupTable;
import gwlpr.mapshard.models.enums.ChatColor;
import gwlpr.mapshard.views.ChatMessageView;
import realityshard.shardlet.EventAggregator;
import realityshard.shardlet.EventHandler;
import realityshard.shardlet.Session;


/**
 * This system is used to manage any ingame chat.
 *
 * @author _rusty
 */
public final class ChatSystem extends GenericSystem
{

    private final static int UPDATEINTERVAL = 0; // update disabled!
    private final ClientLookupTable clientLookup;


    /**
     * Constructor.
     *
     * @param       aggregator
     * @param       clientLookup  
     */
    public ChatSystem(EventAggregator aggregator, ClientLookupTable clientLookup)
    {
        super(aggregator, UPDATEINTERVAL);
        this.clientLookup = clientLookup;
    }


    /**
     * Update Loop
     * TODO: Is there anything we need to do regularily in the chat system?
     *
     * @param       timeDelta
     */
    @Override
    protected void update(int timeDelta)
    {
    }


    /**
     * Event handler.
     * This is our main business. Distribute the message depending on its
     * sender and the target group (or account)
     *
     * Note that this event does not necessarly have to be triggered by a player,
     * because NPCs can use the chat system as well!
     *
     * @param msg
     */
    @EventHandler
    public void onChatMessage(ChatMessageEvent msg)
    {
        // TODO implement me properly!

        // find out the localID of the sender
        AgentIdentifiers aIDs = msg.getSender().get(AgentIdentifiers.class);
        int ownerLID = 0;
        if (aIDs != null) { ownerLID = aIDs.localID; }

        // for now, we'll be sending the message to all people on the server
        for (Session session : clientLookup.getAllSessions())
        {
            ChatMessageView.sendMessage(
                    session,
                    ownerLID,
                    ChatColor.Yellow_White,
                    msg.getMessage());
        }
    }
}
