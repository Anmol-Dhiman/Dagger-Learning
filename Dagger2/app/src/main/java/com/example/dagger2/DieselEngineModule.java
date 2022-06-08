package com.example.dagger2;


import dagger.Module;
import dagger.Provides;


@Module
public class DieselEngineModule {

    //when we have the interface  but we need the object of that interface class only then we will
//make other classes from that interface and then typecast those classes in their respective modules and return them
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine providesEngine() {
        return new DieselEngine(horsePower);
    }

}
