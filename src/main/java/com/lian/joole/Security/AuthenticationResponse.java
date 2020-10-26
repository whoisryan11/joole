package com.lian.joole.Security;

import java.util.Date;

public class AuthenticationResponse {
    private final String token;
    private final Date expirationDate;
    private final Integer userId;

    public AuthenticationResponse(String token, Date expirationDate, Integer userId) {
        this.token = token;
        this.expirationDate = expirationDate;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }
    public Date getExpirationDate() {
        return expirationDate;
    }

    public Integer getUserId() {
        return userId;
    }
}
