package com.test.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/assa")
    public String mainPage() {
        return "main";
    }
}
