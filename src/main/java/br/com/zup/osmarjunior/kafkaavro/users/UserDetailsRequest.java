package br.com.zup.osmarjunior.kafkaavro.users;

import br.com.zup.kafkaavro.avro.UserDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;

public class UserDetailsRequest {

    @NotBlank
    @JsonProperty
    private String name;

    @NotBlank
    @CPF
    @JsonProperty
    private String cpf;

    @NotBlank
    @JsonProperty
    private String address;

    public UserDetailsRequest(String name, String cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public UserDetails toModel() {
        return UserDetails.newBuilder()
                .setName(this.name)
                .setCpf(this.cpf)
                .setAddress(this.address)
                .build();
    }
}
