/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.loginserver.stoc;

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
public final class P001_ComputerInfoReplyAction extends GenericAction
{

    private int data1;
    private int loginCount;
    private int data2;
    private int data3;


    public short getHeader()
    {
        return 1;
    }


    public void setData1(int newValue)
    {
        data1 = newValue;
    }


    public void setLoginCount(int newValue)
    {
        loginCount = newValue;
    }


    public void setData2(int newValue)
    {
        data2 = newValue;
    }


    public void setData3(int newValue)
    {
        data3 = newValue;
    }


    private int getSize()
    {
        return 18;
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

            buffer.putInt(data1);
            buffer.putInt(loginCount);
            buffer.putInt(data2);
            buffer.putInt(data3);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}