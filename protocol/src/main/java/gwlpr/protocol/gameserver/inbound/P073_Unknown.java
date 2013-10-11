
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P073_Unknown
    extends GWMessage
{

    private long agentID1;
    private short unknown2;
    private int unknown3;
    private short unknown4;

    @Override
    public short getHeader() {
        return  73;
    }

    public long getAgentID1() {
        return agentID1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public int getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P073_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append("]");
        return sb.toString();
    }

}