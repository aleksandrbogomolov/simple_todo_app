package com.javarush.simple_todo_app.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "toDoList")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 1, max = 100)
    @Column(name = "VALUE", nullable = false)
    private String value;

    @Column(name = "DONE", insertable = false)
    private Boolean isDone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {

        return getValue();
    }
}
