package com.anirudh.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile()
    {
        System.out.println("-------Compiling-------");
    }
}
