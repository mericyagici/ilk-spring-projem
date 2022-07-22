package de.mericyagici.MericDemoProje4.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
@RequestMapping("/api")
public class UserAPI {
    @GetMapping("v1/user/{id}")
    public String getUserById(@PathVariable Long id){
       final String message = "Hello World";
       return message;
    }


    }



