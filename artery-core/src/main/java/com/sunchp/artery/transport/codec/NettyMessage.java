package com.sunchp.artery.transport.codec;

public class NettyMessage {
    private byte[] data;

    public NettyMessage(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
