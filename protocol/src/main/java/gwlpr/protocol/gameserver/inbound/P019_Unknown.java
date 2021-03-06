
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P019_Unknown
    extends GWMessage
{

    private Vector2 unknown1;
    private long unknown2;

    @Override
    public short getHeader() {
        return  19;
    }

    public Vector2 getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P019_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}
