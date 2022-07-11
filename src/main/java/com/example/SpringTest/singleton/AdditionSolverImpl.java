package com.example.SpringTest.singleton;

import org.springframework.stereotype.Component;

@Component
public class AdditionSolverImpl implements AdditionSolver {
    @Override
    public Integer addOne(int number) {
        return ++number;
    }
}
