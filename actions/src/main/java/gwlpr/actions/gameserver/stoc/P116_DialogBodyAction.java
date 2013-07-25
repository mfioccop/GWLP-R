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
public final class P116_DialogBodyAction extends GenericAction
{

    private char[] body;


    public short getHeader()
    {
        return 116;
    }


    /**
     * body or part of body of the next dialog displayed. 
     * contains html like syntax. maximum size of this field 
     * is 122 wchars. 
     */
    public void setBody(char[] newValue)
    {
        body = newValue;
    }


    private int getSize()
    {
        int size = 4;

        if (body != null)
        {
            size += 2 * body.length;
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

            short prefix_body;
            if (body == null)
            {
                prefix_body = 0;
            }
            else
            {
                prefix_body = (short) body.length;
            }
            buffer.putShort(prefix_body);
            
            for (int i = 0; i < prefix_body; i++)
            {
                buffer.putChar(body[i]);
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