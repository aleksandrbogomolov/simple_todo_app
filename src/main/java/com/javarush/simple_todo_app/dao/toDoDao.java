package com.javarush.simple_todo_app.dao;

import com.javarush.simple_todo_app.model.ToDo;

import java.util.List;

public interface ToDoDao {

    ToDo findToDoById(int id);

    void saveToDo(ToDo toDo);

    void deleteToDoById(ToDo toDo);

    List<ToDo> findAllToDo();

    List<ToDo> showDoneToDo();

    List<ToDo> showNotDoneToDo();
}
