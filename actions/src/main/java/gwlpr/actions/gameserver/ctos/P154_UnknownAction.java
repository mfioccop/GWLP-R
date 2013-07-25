/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.gameserver.ctos;

import realityshard.shardlet.EventAggregator;
import realityshard.shardlet.utils.GenericTriggerableAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P154_UnknownAction extends GenericTriggerableAction
{

    private char[] unknown1;


    public short getHeader()
    {
        return 154;
    }


    public char[] getUnknown1()
    {
        return unknown1;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            short prefix_unknown1 = buffer.getShort();
            unknown1 = new char[prefix_unknown1];
            
            for (int i = 0; i < prefix_unknown1; i++)
            {
                unknown1[i] = buffer.getChar();
            }
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}