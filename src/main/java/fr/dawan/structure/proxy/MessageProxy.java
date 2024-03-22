package fr.dawan.structure.proxy;

import java.util.Locale;

public class MessageProxy implements Message{
    private Message proxyMessage;

    public MessageProxy(Message proxyMessage) {
        this.proxyMessage = proxyMessage;
    }

    @Override
    public String getContent() {
        String msg = proxyMessage.getContent();
        String transfMsg = msg.toUpperCase();
        return transfMsg;
    }
}
