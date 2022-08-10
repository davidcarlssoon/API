package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;


interface MessageRepository extends MongoRepository<Message, String> {

    Message deleteMessageById2(long id);

    Message findFirstByOrderById2Desc();

    Message findById2(Integer id);

    Message findAllByOrderById2Asc();
    
}