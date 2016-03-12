package com.javarush.simple_todo_app;

public class ToDo {

    private String values;
    private boolean isDone;

    public ToDo(String values) {

        this.values = values;
        isDone = false;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone() {

        isDone = true;
        Storage.todoIsDone(this);
    }

    @Override
    public String toString() {

        return getValues();
    }
}
