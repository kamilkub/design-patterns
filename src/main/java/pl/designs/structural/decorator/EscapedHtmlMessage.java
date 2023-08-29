package pl.designs.structural.decorator;

import java.util.Base64;

public class EscapedHtmlMessage implements Message {

    private Message message;


    public EscapedHtmlMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(message.getContent().getBytes());
    }
}
