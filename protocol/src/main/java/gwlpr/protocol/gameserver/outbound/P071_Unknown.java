
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P071_Unknown
    extends GWMessage
{

    private long unknown1;
    private Vector2 unknown2;
    private int unknown3;
    private int unknown4;

    @Override
    public short getHeader() {
        return  71;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(Vector2 unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(int unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(int unknown4) {
        this.unknown4 = unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P071_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append("]");
        return sb.toString();
    }

}
