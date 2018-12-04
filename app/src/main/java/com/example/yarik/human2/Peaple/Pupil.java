package com.example.yarik.human2.Peaple;

import timber.log.Timber;

public class Pupil extends Human implements Pupilinterface{
    public Pupil(){}

    public Pupil(String name){
    this.name=name;
    }
    public Pupil(String name,String lastname){
        this.name=lastname;
    }
    @Override
    public void jump() {
        Timber.d("I can't jump((");
    }
}
