package com.javarush.simple_todo_app.service;

import com.javarush.simple_todo_app.model.ToDo;

import java.util.List;

public interface ToDoService {

    ToDo findById(int id);

    void saveToDo(ToDo toDo);

    void updateToDo(ToDo toDo);

    void setDone(ToDo toDo);

    void deleteToDo(ToDo toDo);

    List<ToDo> findAllToDo();

    List<ToDo> showDoneToDo();

    List<ToDo> showNotDoneToDo();
}
