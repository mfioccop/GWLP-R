
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P089_Unknown
    extends GWMessage
{

    private String unknown1;

    @Override
    public short getHeader() {
        return  89;
    }

    public String getUnknown1() {
        return unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P089_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append("]");
        return sb.toString();
    }

}