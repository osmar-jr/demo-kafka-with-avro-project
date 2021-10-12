package br.com.zup.osmarjunior.kafkaavro.kafka;

import br.com.zup.kafkaavro.avro.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class UserAvroProducer {

    @Autowired
    private Processor processor;

    public void produceUserDetails(UserDetails userDetails) {
        Message<UserDetails> message = MessageBuilder.withPayload(userDetails).build();

        processor.output().send(message);
    }
}
