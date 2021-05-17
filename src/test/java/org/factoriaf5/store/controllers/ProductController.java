package org.factoriaf5.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/health")
    public String check() {
        String greeting = "Hello! I'm a server";
        return greeting;
    }

}




