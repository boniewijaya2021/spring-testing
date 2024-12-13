package com.multiguna.testcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class FormController {

    // Endpoint untuk menampilkan form
    @GetMapping("/form")
    public String showForm() {
        return "taskForm";  // Nama file HTML yang berisi form
    }
}

