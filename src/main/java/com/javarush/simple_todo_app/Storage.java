package com.javarush.simple_todo_app;

import com.javarush.simple_todo_app.model.ToDo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<ToDo> notDoneToDo = new ArrayList<ToDo>();

    public static List<ToDo> getNotDoneToDo() {
        return notDoneToDo;
    }

    public static void addNewToDo() throws IOException {

        String s = Helper.readConsole();
        if (s != null && s.length() > 0) notDoneToDo.add(new ToDo());
    }

    public static void removeToDo(ToDo toDo, List<ToDo> list) {

        if (list.contains(toDo)) list.remove(toDo);
    }

    public static void clearList(List<ToDo> list) {

        list.clear();
    }

    public static void viewList(List<ToDo> list) {

        if (list != null) {
            for (ToDo todo : list) {
                Helper.writeConsole(todo.toString());
            }
        }
    }
}
