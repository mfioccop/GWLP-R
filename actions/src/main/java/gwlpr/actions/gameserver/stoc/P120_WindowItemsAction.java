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
 * This can be used to add items to a window, such as 
 * at a material trader. 
 *
 * @author GWLPR Template Updater
 */
public final class P120_WindowItemsAction extends GenericAction
{

    private int[] itemLocalIDs;


    public short getHeader()
    {
        return 120;
    }


    public void setItemLocalIDs(int[] newValue)
    {
        itemLocalIDs = newValue;
    }


    private int getSize()
    {
        int size = 4;

        if (itemLocalIDs != null)
        {
            size += 4 * itemLocalIDs.length;
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

            short prefix_itemLocalIDs;
            if (itemLocalIDs == null)
            {
                prefix_itemLocalIDs = 0;
            }
            else
            {
                prefix_itemLocalIDs = (short) itemLocalIDs.length;
            }
            buffer.putShort(prefix_itemLocalIDs);
            
            for (int i = 0; i < prefix_itemLocalIDs; i++)
            {
                buffer.putInt(itemLocalIDs[i]);
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