package com.miguelortega.beebags.common.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<Void> login() {
        // The actual authentication logic is handled by Spring Security.
        // This method can be used to perform any additional processing if needed.
        return ResponseEntity.ok().build();
    }
}
