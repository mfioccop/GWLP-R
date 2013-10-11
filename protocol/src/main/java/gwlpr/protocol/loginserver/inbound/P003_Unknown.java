
package gwlpr.protocol.loginserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P003_Unknown
    extends GWMessage
{

    private long unknown1;
    private String unknown2;
    @IsArray(constant = true, size = 20, prefixLength = -1)
    private byte[] unknown3;
    private String unknown4;

    @Override
    public short getHeader() {
        return  3;
    }

    public long getUnknown1() {
        return unknown1;
    }

    public String getUnknown2() {
        return unknown2;
    }

    public byte[] getUnknown3() {
        return unknown3;
    }

    public String getUnknown4() {
        return unknown4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P003_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(this.unknown4 .toString()).append("]");
        return sb.toString();
    }

}