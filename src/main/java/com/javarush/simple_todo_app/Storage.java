package com.javarush.simple_todo_app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<ToDo> notDoneToDo = new ArrayList<ToDo>();
    private static List<ToDo> doneToDo = new ArrayList<ToDo>();

    public static List<ToDo> getNotDoneToDo() {
        return notDoneToDo;
    }

    public static List<ToDo> getDoneToDo() {
        return doneToDo;
    }

    public static void addNewToDo() throws IOException {

        String s = Helper.readConsole();
        if (s != null && s.length() > 0) notDoneToDo.add(new ToDo(s));
    }

    public static void todoIsDone(ToDo toDo) {

        if (notDoneToDo.contains(toDo)) {
            notDoneToDo.remove(toDo);
            doneToDo.add(toDo);
        }
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
