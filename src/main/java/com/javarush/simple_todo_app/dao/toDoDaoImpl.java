package com.javarush.simple_todo_app.dao;

import com.javarush.simple_todo_app.model.ToDo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("toDoDao")
public class ToDoDaoImpl implements ToDoDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public ToDo findToDoById(int id) {
        return getSession().get(ToDo.class, id);
    }

    public void saveToDo(ToDo toDo) {
        getSession().persist(toDo);
    }

    public void deleteToDoById(ToDo toDo) {
        getSession().delete(toDo);
    }

    public List<ToDo> findAllToDo() {
        Criteria criteria = getSession().createCriteria(ToDo.class);
        return (List<ToDo>) criteria.list();
    }
}
