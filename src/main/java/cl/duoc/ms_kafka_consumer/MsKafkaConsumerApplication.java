package cl.duoc.ms_kafka_consumer;

import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MsKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsKafkaConsumerApplication.class, args);
	}

}
