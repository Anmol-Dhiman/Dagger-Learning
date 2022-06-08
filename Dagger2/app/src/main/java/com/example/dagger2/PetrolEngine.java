package com.example.dagger2;

import android.util.Log;



public class PetrolEngine implements Engine {

    private int horsePower;


    public PetrolEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d("Car", "Petrol engine starts...... "+horsePower);
    }
}
