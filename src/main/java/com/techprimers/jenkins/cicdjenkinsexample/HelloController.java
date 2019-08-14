package com.techprimers.jenkins.cicdjenkinsexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Pivotal";
    }
    
    @GetMapping("/helloyou")
    public String helloyou(){
        return "Hello chandra";
    }
}
