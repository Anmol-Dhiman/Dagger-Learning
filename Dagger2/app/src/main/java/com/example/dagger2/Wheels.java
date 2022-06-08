package com.example.dagger2;



public class Wheels {

//suppose if we don't own the wheels class which means that this wheels comes from external library
//and at that point of time we cannot Inject wheels
//    there we use the moudels

    private Rim rim;
    private Tyers tyers;

    public Wheels(Rim rim, Tyers tyers) {
        this.rim = rim;
        this.tyers = tyers;
    }
}
