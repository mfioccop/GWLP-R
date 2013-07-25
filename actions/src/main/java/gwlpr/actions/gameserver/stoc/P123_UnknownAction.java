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
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P123_UnknownAction extends GenericAction
{

    private byte unknown1;
    private int unknown2;
    private int unknown3;
    private int unknown4;
    private int unknown5;
    private int unknown6;
    private int unknown7;
    private int unknown8;
    private short unknown9;
    private short unknown10;
    private short unknown11;
    private short unknown12;
    private short unknown13;
    private byte unknown14;
    private byte unknown15;
    private byte unknown16;
    private byte unknown17;
    private byte unknown18;


    public short getHeader()
    {
        return 123;
    }


    public void setUnknown1(byte newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(int newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(int newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(int newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(int newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(short newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(short newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(short newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(short newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(short newValue)
    {
        unknown13 = newValue;
    }


    public void setUnknown14(byte newValue)
    {
        unknown14 = newValue;
    }


    public void setUnknown15(byte newValue)
    {
        unknown15 = newValue;
    }


    public void setUnknown16(byte newValue)
    {
        unknown16 = newValue;
    }


    public void setUnknown17(byte newValue)
    {
        unknown17 = newValue;
    }


    public void setUnknown18(byte newValue)
    {
        unknown18 = newValue;
    }


    private int getSize()
    {
        return 46;
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

            buffer.put(unknown1);
            buffer.putInt(unknown2);
            buffer.putInt(unknown3);
            buffer.putInt(unknown4);
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.putInt(unknown7);
            buffer.putInt(unknown8);
            buffer.putShort(unknown9);
            buffer.putShort(unknown10);
            buffer.putShort(unknown11);
            buffer.putShort(unknown12);
            buffer.putShort(unknown13);
            buffer.put(unknown14);
            buffer.put(unknown15);
            buffer.put(unknown16);
            buffer.put(unknown17);
            buffer.put(unknown18);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}