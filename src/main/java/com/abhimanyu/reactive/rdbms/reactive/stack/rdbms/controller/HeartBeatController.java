package com.abhimanyu.reactive.rdbms.reactive.stack.rdbms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {

    @GetMapping("/heartbeat")
    public ResponseEntity<String> checkHeartBeat(){
        return new ResponseEntity<>("App is up!", HttpStatus.OK);
    }

}
