package com.softs.mt.fragmentsrecyclerview;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by fkha0003 on 10/01/2019.
 */

public class ApplicationClass extends Application{

    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<Person>();

        people.add(new Person("Chuck Norris", "0321654987"));
        people.add(new Person("John Rambo", "987654321"));
        people.add(new Person("Nelson Mandela", "07908790"));

    }
}
