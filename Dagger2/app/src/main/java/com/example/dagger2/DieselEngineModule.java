package com.example.dagger2;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;


@Module
public abstract class DieselEngineModule {

    //when we have the interface  but we need the object of that interface class only then we will
//make other classes from that interface and then typecast those classes in their respective modules and return them


    @Binds
    abstract Engine providesEngine(DieselEngine dieselEngine);

}
