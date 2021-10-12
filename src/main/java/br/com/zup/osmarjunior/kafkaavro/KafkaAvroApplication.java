package br.com.zup.osmarjunior.kafkaavro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.schema.client.EnableSchemaRegistryClient;

@EnableBinding(Processor.class)
@EnableSchemaRegistryClient
@SpringBootApplication
public class KafkaAvroApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaAvroApplication.class, args);
    }

}
