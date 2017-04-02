package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vagrant on 4/1/17.
 */
@RestController
public class HelloWorldRestController {

    @RequestMapping(value = "/{studentName}", method = RequestMethod.GET)
    public String greeting(@PathVariable String studentName ) {
        return "Greet " + studentName;
    }

    @RequestMapping(value = "/hello/{userId}", method = RequestMethod.GET)
    public String HelloUserId(@PathVariable int userId ) {
        return "Hello " + userId;
    }
}