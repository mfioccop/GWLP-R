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
public final class P316_EquipBagAction extends GenericAction
{

    private short itemStreamID;
    private byte storageID;
    private short pageID;
    private byte slots;
    private int bagLocalID;


    public short getHeader()
    {
        return 316;
    }


    public void setItemStreamID(short newValue)
    {
        itemStreamID = newValue;
    }


    public void setStorageID(byte newValue)
    {
        storageID = newValue;
    }


    public void setPageID(short newValue)
    {
        pageID = newValue;
    }


    public void setSlots(byte newValue)
    {
        slots = newValue;
    }


    public void setBagLocalID(int newValue)
    {
        bagLocalID = newValue;
    }


    private int getSize()
    {
        return 12;
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

            buffer.putShort(itemStreamID);
            buffer.put(storageID);
            buffer.putShort(pageID);
            buffer.put(slots);
            buffer.putInt(bagLocalID);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}