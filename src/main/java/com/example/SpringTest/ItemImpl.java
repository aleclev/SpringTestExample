package com.example.SpringTest;

import org.springframework.stereotype.Component;

@Component
public class ItemImpl implements Item {

    @Override
    public String getHelloWorld() {
        return "Hello world fancy";
    }
}
