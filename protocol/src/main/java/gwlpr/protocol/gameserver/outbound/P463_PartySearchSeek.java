
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P463_PartySearchSeek
    extends GWMessage
{

    private int seeking;

    @Override
    public short getHeader() {
        return  463;
    }

    public void setSeeking(int seeking) {
        this.seeking = seeking;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P463_PartySearchSeek[");
        sb.append("seeking=").append(this.seeking).append("]");
        return sb.toString();
    }

}