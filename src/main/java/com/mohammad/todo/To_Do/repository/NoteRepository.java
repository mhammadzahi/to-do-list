package com.mohammad.todo.To_Do.repository;

import com.mohammad.todo.To_Do.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
