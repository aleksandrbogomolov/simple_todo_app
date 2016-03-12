package com.javarush.simple_todo_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {

    public static String readConsole() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        return s;
    }

    public static void writeConsole(String s) {

        System.out.println(s);
    }
}
