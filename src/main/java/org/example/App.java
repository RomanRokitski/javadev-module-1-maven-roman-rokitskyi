package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Roman", "Rokitskyi");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
