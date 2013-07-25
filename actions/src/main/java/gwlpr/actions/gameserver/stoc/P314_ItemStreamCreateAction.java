/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.gameserver.stoc;

import realityshard.shardlet.utils.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 *
 * @author GWLPR Template Updater
 */
public final class P314_ItemStreamCreateAction extends GenericAction
{

    private short streamID;
    private byte type;


    public short getHeader()
    {
        return 314;
    }


    public void setStreamID(short newValue)
    {
        streamID = newValue;
    }


    public void setType(byte newValue)
    {
        type = newValue;
    }


    private int getSize()
    {
        return 5;
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

            buffer.putShort(streamID);
            buffer.put(type);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}