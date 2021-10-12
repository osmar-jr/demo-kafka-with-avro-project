package br.com.zup.osmarjunior.kafkaavro.kafka;

import br.com.zup.kafkaavro.avro.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

@Service
public class UserAvroConsumer {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @StreamListener(Processor.INPUT)
    public void consumeUserDetails(UserDetails userDetails){
        logger.info(userDetails.toString());
    }
}
