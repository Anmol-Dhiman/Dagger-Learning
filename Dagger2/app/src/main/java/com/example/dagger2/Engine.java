package com.example.dagger2;

import javax.inject.Inject;



//when we have the interface  but we need the object of that interface class only then we will
//make other classes from that interface and then typecast those classes in their respective modules and return them

public interface Engine {
    void start();
}
