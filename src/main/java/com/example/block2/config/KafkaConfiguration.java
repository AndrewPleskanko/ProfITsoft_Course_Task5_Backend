package com.example.block2.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic emailServiceTopic() {
        return new NewTopic("user-deactivation", 2, (short) 1);
    }
}
