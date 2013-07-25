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
public final class P147_UpdateGenericValueIntAction extends GenericAction
{

    private int valueID;
    private int agentID;
    private int value;


    public short getHeader()
    {
        return 147;
    }


    public void setValueID(int newValue)
    {
        valueID = newValue;
    }


    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    public void setValue(int newValue)
    {
        value = newValue;
    }


    private int getSize()
    {
        return 14;
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

            buffer.putInt(valueID);
            buffer.putInt(agentID);
            buffer.putInt(value);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}