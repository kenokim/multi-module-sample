package com.example.application;

import com.example.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApplicationController {
    private final SampleService service;

    @GetMapping("/hello")
    public String hello() {
        service.hello();
        return "Hello";
    }
}
