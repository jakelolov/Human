package com.example.yarik.human2.Peaple;

import timber.log.Timber;

public abstract class Human implements Humaninterface{
    public int age = 19;
    String name = "Valere";

//    abstract void jump();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {


        this.name = name;
    }

    @Override
    public void eat() {
        Timber.d("I can't eat(((");
    }

    @Override
    public void run() {
        Timber.d("I can't run((");
    }

    @Override
    public void go() {
        Timber.d("I can't go((");
    }
}
