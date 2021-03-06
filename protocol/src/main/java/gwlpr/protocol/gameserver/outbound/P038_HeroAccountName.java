
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P038_HeroAccountName
    extends GWMessage
{

    private String accountName;

    @Override
    public short getHeader() {
        return  38;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P038_HeroAccountName[");
        sb.append("accountName=").append(this.accountName.toString()).append("]");
        return sb.toString();
    }

}
