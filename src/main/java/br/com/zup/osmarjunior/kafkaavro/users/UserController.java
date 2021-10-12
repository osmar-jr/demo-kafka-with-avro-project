package br.com.zup.osmarjunior.kafkaavro.users;

import br.com.zup.kafkaavro.avro.UserDetails;
import br.com.zup.osmarjunior.kafkaavro.kafka.UserAvroProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserAvroProducer producer;

    @PostMapping
    public ResponseEntity<?> notify(@RequestBody @Valid UserDetailsRequest request){
        UserDetails userDetails = request.toModel();
        producer.produceUserDetails(userDetails);

        return ResponseEntity.ok(request);
    }
}
