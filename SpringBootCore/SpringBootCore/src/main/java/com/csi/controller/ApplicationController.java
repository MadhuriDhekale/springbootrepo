package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public  String sayHello(){

        return  "CSI PUNE";
}
    @GetMapping("/services")
    public  String sayServices(){
        return  "Maths Development";
    }

    @GetMapping("/hi")
    public  String say(){

        return  "Welcome ";
    }

}
