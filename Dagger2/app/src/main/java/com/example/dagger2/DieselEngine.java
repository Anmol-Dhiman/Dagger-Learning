package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements  Engine{

  @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d("Car", "diesel engine starts........");
    }
}
