package com.mohammad.todo.To_Do.controller;

import com.mohammad.todo.To_Do.model.Note;
import com.mohammad.todo.To_Do.repository.NoteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class NoteController {
    private final NoteRepository noteRepo;

    public NoteController(NoteRepository noteRepo){
        this.noteRepo = noteRepo;
    }
    @GetMapping("/")
    public Map<String, String> index() {
        //System.out.println("Hello2s");
        return Map.of("message", "Hello From Spring Boot");
    }

    @GetMapping("/get-all-notes")
    public List<Note> getAllNotes(){
        return noteRepo.findAll();
    }

    @GetMapping("/get-note/{id}")
    public Note getOneNote(@PathVariable Long id){
        Optional<Note> note = noteRepo.findById(id);
        System.out.println("-----------------------" + note.toString());
        return note.orElse(null);

    }

}
