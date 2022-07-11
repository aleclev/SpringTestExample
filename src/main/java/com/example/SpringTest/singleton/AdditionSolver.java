package com.example.SpringTest.singleton;

import org.springframework.stereotype.Component;

@Component
public interface AdditionSolver {
    Integer addOne(int number);
}
