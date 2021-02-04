package com.kazuki43zoo.jpetstore.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String main() {
        return "admin/main";
    }
}
