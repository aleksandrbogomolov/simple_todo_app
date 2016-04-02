package com.javarush.simple_todo_app.dao;

import com.javarush.simple_todo_app.model.ToDo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository("toDoDao")
public class ToDoDaoImpl implements ToDoDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
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

    public List<ToDo> showDoneToDo() {
        return showToDo(true);
    }

    public List<ToDo> showNotDoneToDo() {
        return showToDo(false);
    }

    private List<ToDo> showToDo(Boolean done) {

        List<ToDo> list = findAllToDo();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ToDo toDo = (ToDo) iterator.next();
            if (toDo.getDone() != done) iterator.remove();
        }
        return list;
    }
}
