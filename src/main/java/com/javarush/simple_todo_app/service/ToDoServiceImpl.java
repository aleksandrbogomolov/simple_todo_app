package com.javarush.simple_todo_app.service;

import com.javarush.simple_todo_app.dao.ToDoDao;
import com.javarush.simple_todo_app.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("toDoService")
@Transactional
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoDao toDoDao;

    public ToDo findById(int id) {
        return toDoDao.findToDoById(id);
    }

    public void saveToDo(ToDo toDo) {
        toDoDao.saveToDo(toDo);
    }

    public void updateToDo(ToDo toDo) {
        ToDo upToDo = toDoDao.findToDoById(toDo.getId());
        if (upToDo != null) {
            upToDo.setValue(toDo.getValue());
        }
    }

    public void setDone(ToDo toDo) {
        ToDo upToDo = toDoDao.findToDoById(toDo.getId());
        if (upToDo != null) {
            upToDo.setDone(toDo.getDone());
        }
    }

    public void deleteToDo(ToDo toDo) {
        toDoDao.deleteToDoById(toDo);
    }

    public List<ToDo> findAllToDo() {
        return toDoDao.findAllToDo();
    }
}
