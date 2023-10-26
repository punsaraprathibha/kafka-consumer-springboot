package com.wiley.phoenix.kafkaconsumerspringboot.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "partitioned-kafka-topic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Message = " + message);
    }
}
