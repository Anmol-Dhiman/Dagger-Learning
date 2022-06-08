package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;



public class PetrolEngine implements Engine {

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(int horsePower, @Named("engine capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void start() {
        Log.d("Car", "Petrol engine starts...... " + horsePower+" engine capacity  "+engineCapacity);
    }
}
