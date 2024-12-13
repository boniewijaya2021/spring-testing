package com.multiguna.testcode.controller;

import com.multiguna.testcode.dto.MessageModel;
import com.multiguna.testcode.service.FirstNonRepeating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TaskOne {

    @Autowired
    private FirstNonRepeating fs;

    @GetMapping("/form")
    public String showForm() {
        return "form";  // Nama file HTML yang berisi form
    }

    @PostMapping("/taskSatu")
    private ResponseEntity<MessageModel> getFn(@RequestBody List<Integer> numbers) {
        // Panggil metode findFirstNonRepeating di service
        ResponseEntity<Integer> responseEntity = fs.findFirstNonRepeating(numbers);
        if (responseEntity.getBody() == -1) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new MessageModel("Tidak ada angka yang tidak berulang."));
        }
        return ResponseEntity.ok(new MessageModel("Angka pertama yang tidak berulang adalah: " + responseEntity.getBody()));
    }


}
