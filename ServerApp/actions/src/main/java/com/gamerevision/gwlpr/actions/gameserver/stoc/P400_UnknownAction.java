/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P400_UnknownAction extends GenericAction
{

    public final class NestedUnknown1
    {
    
        private short unknown2;
        private int unknown3;


        public void setUnknown2(short newValue)
        {
            unknown2 = newValue;
        }


        public void setUnknown3(int newValue)
        {
            unknown3 = newValue;
        }


        private int getSize()
        {
            return 6;
        }


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.putShort(unknown2);
                buffer.putInt(unknown3);
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private List<NestedUnknown1> unknown1;


    public short getHeader()
    {
        return 400;
    }


    public void setUnknown1(List<NestedUnknown1> newValue)
    {
        unknown1 = newValue;
    }


    private int getSize()
    {
        int size = 3;

        if (unknown1 == null)
        {
            return 0;
        }
        
        for (NestedUnknown1 entry : unknown1)
        {
            int nextSize = entry.getSize();
        
            if (nextSize == 0)
            {
                return 0;
            }
        
            size += entry.getSize();
        }

        return size;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            byte prefix_unknown1 = (byte) unknown1.size();
            buffer.put(prefix_unknown1);
            
            for (int i = 0; i < prefix_unknown1; i++)
            {
                if (!unknown1.get(i).serialize(buffer))
                {
                    return false;
                }
            }
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}