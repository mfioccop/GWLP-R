
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P153_SpeechBubble
    extends GWMessage
{

    private long agentID;
    private String text;

    @Override
    public short getHeader() {
        return  153;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P153_SpeechBubble[");
        sb.append("agentID=").append(this.agentID).append(",text=").append(this.text.toString()).append("]");
        return sb.toString();
    }

}