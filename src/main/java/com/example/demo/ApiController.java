package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/demo")

public class ApiController {

    @GetMapping(path = "test")
    public String getTest(){
        return ApiService.getTest();
    }
}
