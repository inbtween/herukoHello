package com.company.helloheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloHerokuController {

    private static String name = "Michelle";

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public static String greeting() {
        return "Hello, Heroku";
    }

    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String sayHi(@PathVariable String name ) {
        return "What's happening, " + name;
    }
}
