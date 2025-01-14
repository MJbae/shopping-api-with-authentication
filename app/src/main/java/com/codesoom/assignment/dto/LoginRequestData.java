package com.codesoom.assignment.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
public class LoginRequestData {
    private final String email;

    private final String password;

    @Builder
    @JsonCreator
    public LoginRequestData(@JsonProperty("email") String email,
                            @JsonProperty("password") String password) {
        this.email = email;
        this.password = password;
    }
}
