package com.example.demo.pong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/pong")
public class POngController {

    @GetMapping
    public String ping (){
        String pong = "ping-pong-Jordan-Sekyonda";
        return pong;
    }

}
