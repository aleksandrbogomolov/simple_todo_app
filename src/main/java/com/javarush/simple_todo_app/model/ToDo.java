package com.javarush.simple_todo_app.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "notDoneToDo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 1, max = 100)
    @Column(name = "VALUE", nullable = false)
    private String values;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public String toString() {

        return getValues();
    }
}
