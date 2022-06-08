package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";


//here we are doing all the three injections so the sequence is : -
//    constructor -> field -> method

//    and if we would not make the constructor injection then we have to call the field and method injection manually

    //    the field injection
    @Inject
    Engine engine;


    private Wheels wheels;

//    dependecy injection means that the class will not initilize the variables instead of that we will pass those variablbe to the class


//    this annotation is standardize in JSR 330


    //    the constructor injection
    @Inject
    public Car(Wheels wheels) {

        this.wheels = wheels;
        Log.d(TAG, "Car: constructor injection...");
    }


    //the method injection
    @Inject
    public void methodInject(Remote remote) {
        remote.setListenere();
    }


    public void drive() {
        engine.start();
        Log.d(TAG, "drive: ....");
    }


}
