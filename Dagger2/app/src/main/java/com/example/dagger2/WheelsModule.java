package com.example.dagger2;




import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {


    @Provides
    static Rim rim() {
        Rim rim = new Rim();
        rim.generated();
        return rim;
    }

    @Provides
    static Tyers tyers() {
        Tyers tyers = new Tyers();
        tyers.generatedTyer();
        return tyers;
    }

    @Provides
    static Wheels Wheels(Rim rim, Tyers tyers) {
        return new Wheels(rim, tyers);
    }
}
