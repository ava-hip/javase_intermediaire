package fr.dawan.structure.proxy;

public class UserMessage implements Message{
    private String content;

    public UserMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
