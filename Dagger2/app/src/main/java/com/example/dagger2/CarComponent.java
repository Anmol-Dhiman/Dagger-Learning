package com.example.dagger2;


import dagger.Component;

//this annotation will generate all the code for initilizing the variables which the needed by the car class

//now the getCar() get the wheels from the WheelsModuel.class
@Component(modules = WheelsModule.class)
public interface CarComponent {
//   we can call it injector



    Car getCar();

    void inject(MainActivity mainActivity);

}
