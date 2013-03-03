/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.events;

import com.gamerevision.gwlpr.mapshard.entitysystem.Entity;
import com.realityshard.shardlet.Event;


/**
 * This event is triggered when we received a chat-command.
 *
 * Hint: NPCs may issue chat-commands too.
 *
 * @author _rusty
 */
public class ChatCommandEvent implements Event
{

    private final Entity sender;
    private final String message;


    /**
     * Constructor.
     *
     * @param       sender                  The entity that sent
     * @param       message                 The message
     */
    public ChatCommandEvent(Entity sender, String message)
    {
        this.sender = sender;
        this.message = message;
    }


    /**
     * Getter.
     *
     * @return
     */
    public Entity getSender()
    {
        return sender;
    }


    /**
     * Getter.
     *
     * @return
     */
    public String getMessage()
    {
        return message;
    }
}
