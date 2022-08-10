package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/public/messages")
    MessageList getAllMessages() {

        return messageService.findAllMessages();

    }

    @PostMapping("/admin/messages")
    Message newMessage(@RequestBody Message newMessage) {

        return messageService.saveMessage(newMessage);

    }

    @GetMapping("/public/messages/{id2}")
    Message getOneMessage(@PathVariable Integer id2) {

        return messageService.findMessageById2(id2);

    }

    @PutMapping("/admin/messages/{id2}")
    Message replaceMessage(@RequestBody Message newMessage, @PathVariable Integer id2) {

        return messageService.updateMessageById2(newMessage, id2);

    }

    @DeleteMapping("/admin/messages/{id2}")
    void deleteMessage(@PathVariable Integer id2) {
        messageService.deleteMessageById2(id2);
    }
}