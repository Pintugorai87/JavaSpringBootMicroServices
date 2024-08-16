package com.myownproject.CloudGateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {
    private String userid;
    private String accessToken;
    private String refreshToken;
    private long expiresAt;
    private Collection<String> authorityList;

}
