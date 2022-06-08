package com.example.dagger2;


import javax.inject.Named;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;

//this annotation will generate all the code for initilizing the variables which the needed by the car class

//now the getCar() get the wheels from the WheelsModuel.class
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
//   we can call it injector


    Car getCar();

    void inject(MainActivity mainActivity);

//    to make the code efficient and making the module code as simple as that was....
//we do: -

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(int horsePower);
 @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }


}
