package com.mohammad.todo.To_Do.model;

import jakarta.persistence.*;

@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Description;

    public void setDescription(String description){
        this.Description = description;
    }

    public String getDescription() {
        return Description;
    }
}
