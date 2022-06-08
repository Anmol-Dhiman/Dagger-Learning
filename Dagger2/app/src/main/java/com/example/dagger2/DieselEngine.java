package com.example.dagger2;

import android.util.Log;



public class DieselEngine implements Engine {

    private int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }


    @Override
    public void start() {
        Log.d("Car", "diesel engine starts........");
    }
}
