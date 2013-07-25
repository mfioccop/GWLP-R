/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.gameserver.ctos;

import realityshard.shardlet.EventAggregator;
import realityshard.shardlet.utils.GenericTriggerableAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 *
 * @author GWLPR Template Updater
 */
public final class P086_SwapSkillsOnBarAction extends GenericTriggerableAction
{

    private int agentID;
    private int skillID1;
    private int unknown1;
    private int skillID2;
    private int unknown2;


    public short getHeader()
    {
        return 86;
    }


    public int getAgentID()
    {
        return agentID;
    }


    /**
     * ID of the skill you drag 
     */
    public int getSkillID1()
    {
        return skillID1;
    }


    /**
     * is usually 0, but seems to be -1 or -2 if this skill 
     * appears more than once on the bar (e.g. by echo) 
     */
    public int getUnknown1()
    {
        return unknown1;
    }


    /**
     * ID of the skill you dropped Skill1 on 
     */
    public int getSkillID2()
    {
        return skillID2;
    }


    /**
     * same as above, usually 0 
     */
    public int getUnknown2()
    {
        return unknown2;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            agentID = buffer.getInt();
            skillID1 = buffer.getInt();
            unknown1 = buffer.getInt();
            skillID2 = buffer.getInt();
            unknown2 = buffer.getInt();
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}