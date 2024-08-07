package com.kng.testproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class DeleteController {

    // http://localhost:8080/api/v1/get-api/variable1/{String값}
    @DeleteMapping(value = "/delete/{variable}")
    public String deleteVariable(@PathVariable("variable") String variable) {
        // A deletion is made from the database and a status is returned (actually).
        return variable;
    }
}
