package code.christ.netty.protocol.packet.request;


import code.christ.netty.protocol.Command;
import code.christ.netty.protocol.packet.Packet;

/**
 * Created by christmad on 2019/11/4.
 */
public class HeartBeatRequestPacket extends Packet {
    @Override
    public byte getCommand() {
        return Command.HEART_BEAT_REQUEST;
    }
}
