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
public final class P057_UnknownAction extends GenericTriggerableAction
{

    private float unknown1;
    private float unknown2;


    public short getHeader()
    {
        return 57;
    }


    public float getUnknown1()
    {
        return unknown1;
    }


    public float getUnknown2()
    {
        return unknown2;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getFloat();
            unknown2 = buffer.getFloat();
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