package cl.duoc.ms_kafka_consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic solicitudesEventosTopic() {
        return TopicBuilder
                .name("solicitudes-eventos")
                .partitions(3)
                .replicas(1)
                .build();
    }
}