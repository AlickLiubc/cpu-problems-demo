package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private boolean isTrue = true;

    @GetMapping("/get")
    public String get() {
        while (isTrue) {
            ;
        }

        return "success";
    }

}
