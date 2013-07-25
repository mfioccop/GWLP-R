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
public final class P171_UpdatePrivProfessionsAction extends GenericAction
{

    private int agentID;
    private byte primaryProf;
    private byte secondaryProf;
    private byte isPvP;


    public short getHeader()
    {
        return 171;
    }


    public void setAgentID(int newValue)
    {
        agentID = newValue;
    }


    public void setPrimaryProf(byte newValue)
    {
        primaryProf = newValue;
    }


    public void setSecondaryProf(byte newValue)
    {
        secondaryProf = newValue;
    }


    public void setisPvP(byte newValue)
    {
        isPvP = newValue;
    }


    private int getSize()
    {
        return 9;
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
            buffer.put(primaryProf);
            buffer.put(secondaryProf);
            buffer.put(isPvP);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}