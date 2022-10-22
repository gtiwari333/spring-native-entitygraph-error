package com.example.demo;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface NoteRepo extends JpaRepository<Note, Long> {
    @EntityGraph(attributePaths = {"comments"})
    List<Note> findAll();
}
