package com.supertux.superserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperController {
    @GetMapping("/testing")
    public String connectionTest(){
            return "Соединение установлено !";
    }

}
