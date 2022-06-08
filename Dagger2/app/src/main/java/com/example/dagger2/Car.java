package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    private Enigine enigine;
    private Wheels wheels;

//    dependecy injection means that the class will not initilize the variables instead of that we will pass those variablbe to the class


//    this annotation is standardize in JSR 330

    @Inject
    public Car(Enigine enigine, Wheels wheels) {
        this.enigine = enigine;
        this.wheels = wheels;
    }
    public void drive (){
        Log.d(TAG, "drive: ....");
    }


}
