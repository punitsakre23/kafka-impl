package com.tmkoc.kafka_impl.controller.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = "tmkoc-topic", groupId = "tmkoc-group")
    public void receiveMessage(String message) {
        log.info("The message received is: {}", message);
    }
}
