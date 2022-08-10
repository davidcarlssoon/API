package com.example.demo;

import java.util.List;

public class MessageList {
    public List<Message> messages;

    public MessageList(List<Message> messages) {
        this.messages = messages;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
