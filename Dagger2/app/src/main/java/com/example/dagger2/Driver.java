package com.example.dagger2;

import javax.inject.Inject;
import javax.inject.Singleton;


//when we want to use the same driver object for all the car object then  we use the @Singleton annotation
@Singleton
public class Driver {

    @Inject
    Driver() {
    }
}
