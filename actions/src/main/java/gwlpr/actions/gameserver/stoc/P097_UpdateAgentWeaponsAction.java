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
public final class P097_UpdateAgentWeaponsAction extends GenericAction
{

    private int agentID;
    private int leadhand;
    private int offhand;


    public short getHeader()
    {
        return 97;
    }


    /**
     * the agent to update 
     */
    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    /**
     * the item to equip in the leadhand 
     */
    public void setLeadhand(int newValue)
    {
        leadhand = newValue;
    }


    /**
     * the item to equip in the offhand 
     */
    public void setOffhand(int newValue)
    {
        offhand = newValue;
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

            buffer.putInt(agentID);
            buffer.putInt(leadhand);
            buffer.putInt(offhand);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}