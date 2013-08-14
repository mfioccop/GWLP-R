
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P282_Unknown
    extends GWMessage
{

    @IsArray(constant = true, size = 16, prefixLength = -1)
    private byte[] unknown1;
    private short unknown2;

    @Override
    public short getHeader() {
        return  282;
    }

    public void setUnknown1(byte[] unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(short unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P282_Unknown[");
        sb.append("unknown1=").append(Arrays.toString(this.unknown1)).append(",unknown2=").append(this.unknown2).append("]");
        return sb.toString();
    }

}