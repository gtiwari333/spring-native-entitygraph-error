package com.example.demo;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class AService {

    @EventListener
    public void ctxRefreshed(ContextRefreshedEvent evt) {
        System.out.println("HELLO WORLD!!!");
    }
}
