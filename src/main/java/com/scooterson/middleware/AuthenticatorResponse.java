package com.scooterson.middleware;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticatorResponse {

    private String id;

    @JsonProperty("authenticator_type")
    private String authenticatorType;

    private String active;

    @JsonProperty("oob_channel")
    private String channel;

    private String name;
}
