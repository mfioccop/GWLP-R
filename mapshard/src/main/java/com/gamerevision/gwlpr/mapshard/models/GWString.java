/**
 * For copyright information see the LICENSE document.
 */

package com.gamerevision.gwlpr.mapshard.models;


/**
 * This class is used as a utility to handle GW specific string formats.
 * 
 * Hint: This concerns stuff like chat formatting.
 * 
 * @author _rusty
 */
public class GWString 
{
    
    /**
     * Create a correctly formatted chat message
     * (no lenght check here!)
     * 
     * @param       msg                     The chat message
     * @return      The chat message ready to be send to a client.
     */
    public static String formatChat(String msg)
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.copyValueOf(new char[] {0x08, 0x01, 0x07, 0x01}));
        sb.append(msg);
        sb.append(String.copyValueOf(new char[] {0x01, 0x00}));
        
        return sb.toString();
    }
}
