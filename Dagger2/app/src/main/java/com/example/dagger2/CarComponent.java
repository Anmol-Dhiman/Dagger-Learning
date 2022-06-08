package com.example.dagger2;


import dagger.Component;

//this annotation will generate all the code for initilizing the variables which the needed by the car class

@Component
public interface CarComponent {
//   we can call it injector

    Car getCar();

}
