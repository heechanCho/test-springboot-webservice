package com.test.admin.web;

import com.test.admin.web.dto.HelloResponseDto;
import com.test.admin.web.dto.PersonDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeechanController {

    @GetMapping("/chan")
    public String heechan() {
        return "heechan";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

    @GetMapping("/person/dto")
    public PersonDto personDto(@RequestParam("name") String name, @RequestParam("age") int age) {

        return new PersonDto(name, age);
    }
}
