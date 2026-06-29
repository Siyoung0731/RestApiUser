package com.example.restapiuser.dto;

import org.springframework.http.ResponseEntity;

public record DeleteReponse(
        String userid,
        boolean deleted
) {

}
