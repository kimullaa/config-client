package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/02/28.
 */
@RestController
public class GreetingRestController {
    @RequestMapping("/greeting")
    public Greeting greeting(@Value("${greeting:not-found}") String greeting) {
        return new Greeting(greeting);
    }
}
