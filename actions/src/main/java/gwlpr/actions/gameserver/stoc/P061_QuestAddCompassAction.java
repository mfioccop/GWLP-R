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
public final class P061_QuestAddCompassAction extends GenericAction
{

    private int iD;
    private float[] position;
    private short data4;
    private short data5;
    private int data6;
    private char[] category;
    private char[] name;
    private char[] givenBy;
    private short mapID;


    public short getHeader()
    {
        return 61;
    }


    public void setID(int newValue)
    {
        iD = newValue;
    }


    /**
     * the x/y-coordinates 
     */
    public void setPosition(float[] newValue)
    {
        position = newValue;
    }


    public void setData4(short newValue)
    {
        data4 = newValue;
    }


    public void setData5(short newValue)
    {
        data5 = newValue;
    }


    public void setData6(int newValue)
    {
        data6 = newValue;
    }


    public void setCategory(char[] newValue)
    {
        category = newValue;
    }


    public void setName(char[] newValue)
    {
        name = newValue;
    }


    /**
     * The name of the NPC that gave the quest. 
     */
    public void setGivenBy(char[] newValue)
    {
        givenBy = newValue;
    }


    /**
     * The Map ID where the quest was given. 
     */
    public void setMapID(short newValue)
    {
        mapID = newValue;
    }


    private int getSize()
    {
        int size = 30;

        if (position == null)
        {
            return 0;
        }
        
        if (position.length != 2)
        {
            return 0;
        }
        if (category != null)
        {
            size += 2 * category.length;
        }
        if (name != null)
        {
            size += 2 * name.length;
        }
        if (givenBy != null)
        {
            size += 2 * givenBy.length;
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

            buffer.putInt(iD);
            buffer.putFloat(position[0]);
            buffer.putFloat(position[1]);
            buffer.putShort(data4);
            buffer.putShort(data5);
            buffer.putInt(data6);
            short prefix_category;
            if (category == null)
            {
                prefix_category = 0;
            }
            else
            {
                prefix_category = (short) category.length;
            }
            buffer.putShort(prefix_category);
            
            for (int i = 0; i < prefix_category; i++)
            {
                buffer.putChar(category[i]);
            }
            short prefix_name;
            if (name == null)
            {
                prefix_name = 0;
            }
            else
            {
                prefix_name = (short) name.length;
            }
            buffer.putShort(prefix_name);
            
            for (int i = 0; i < prefix_name; i++)
            {
                buffer.putChar(name[i]);
            }
            short prefix_givenBy;
            if (givenBy == null)
            {
                prefix_givenBy = 0;
            }
            else
            {
                prefix_givenBy = (short) givenBy.length;
            }
            buffer.putShort(prefix_givenBy);
            
            for (int i = 0; i < prefix_givenBy; i++)
            {
                buffer.putChar(givenBy[i]);
            }
            buffer.putShort(mapID);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}