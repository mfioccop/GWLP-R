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
public final class P033_UpdateAgentPositionAction extends GenericAction
{

    private int agentID;
    private float[] position;
    private short plane;


    public short getHeader()
    {
        return 33;
    }


    /**
     * the agent to update 
     */
    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    /**
     * the x/y-coordinates 
     */
    public void setPosition(float[] newValue)
    {
        position = newValue;
    }


    /**
     * plane the agent ist standing on 
     */
    public void setPlane(short newValue)
    {
        plane = newValue;
    }


    private int getSize()
    {
        int size = 16;

        if (position == null)
        {
            return 0;
        }
        
        if (position.length != 2)
        {
            return 0;
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

            buffer.putInt(agentID);
            buffer.putFloat(position[0]);
            buffer.putFloat(position[1]);
            buffer.putShort(plane);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}