package com.example.SpringTest.controllers;

import com.example.SpringTest.singleton.AdditionSolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @Autowired
    private AdditionSolver additionSolver;

    @GetMapping("/getPlusOne/{number}")
    String getPlusOne(@PathVariable int number) {
        return String.format("%s + 1 = %s", number, additionSolver.addOne(number).toString());
    }
}
