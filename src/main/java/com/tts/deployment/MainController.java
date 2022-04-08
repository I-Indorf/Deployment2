package com.tts.deployment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @Controller
    public class MainController {
        @RequestMapping("/") //http:localhost:8080/
        public String home() {
            return "index";
        }
    }

