package com.example.dagger2;

import android.app.Application;

public class ComponentProvider extends Application {

    private CarComponent carComponent;

//    when we rotate our phone then the component will get regenrated and we will lose our data for the objects and to solve this problem we made this class which will pass the component

    @Override
    public void onCreate() {
        super.onCreate();

        carComponent = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1402)
                .build();



    }

    public CarComponent getCarComponent() {
        return carComponent;
    }
}
