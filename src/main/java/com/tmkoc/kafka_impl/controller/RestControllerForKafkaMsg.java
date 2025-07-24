package com.tmkoc.kafka_impl.controller;

import com.tmkoc.kafka_impl.controller.service.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
@RequiredArgsConstructor
public class RestControllerForKafkaMsg {

    private final Producer producer;

    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }

}
