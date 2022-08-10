package com.example.demo;

public interface MessageService {

    MessageList findAllMessages();

    Message saveMessage(Message message);

    Message findMessageById2(Integer id);

    void deleteMessageById2(Integer id);

    Message updateMessageById2(Message message, Integer id2);

}