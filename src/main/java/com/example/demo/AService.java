package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class AService {

    @Autowired
    NoteRepo noteRepo;

    @EventListener
    public void ctxRefreshed(ContextRefreshedEvent evt) {
        noteRepo.findAll();
    }
}
