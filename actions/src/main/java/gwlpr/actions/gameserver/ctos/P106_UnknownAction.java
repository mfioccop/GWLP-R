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
public final class P106_UnknownAction extends GenericTriggerableAction
{

    public final class NestedUnknown2
    {
    
        private byte unknown3;
        private int unknown4;


        public byte getUnknown3()
        {
            return unknown3;
        }


        public int getUnknown4()
        {
            return unknown4;
        }


        public boolean deserialize(ByteBuffer buffer)
        {
            int bufferPosition = buffer.position();

            try
            {
                unknown3 = buffer.get();
                unknown4 = buffer.getInt();
            }
            catch (BufferUnderflowException e)
            {
                buffer.position(bufferPosition);
                return false;
            }

            return true;
        }
    }


    private byte unknown1;
    private NestedUnknown2[] unknown2;


    public short getHeader()
    {
        return 106;
    }


    public byte getUnknown1()
    {
        return unknown1;
    }


    public NestedUnknown2[] getUnknown2()
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
            unknown1 = buffer.get();
            byte prefix_unknown2 = buffer.get();
            unknown2 = new NestedUnknown2[prefix_unknown2];
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                NestedUnknown2 newEntry = new NestedUnknown2();
            
                if (!newEntry.deserialize(buffer))
                {
                    buffer.position(bufferPosition);
                    return false;
                }
            
                unknown2[i] = newEntry;
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