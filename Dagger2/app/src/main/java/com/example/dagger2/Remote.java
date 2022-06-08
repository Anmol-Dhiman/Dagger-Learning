package com.example.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    Remote() {

    }

    public void setListenere() {
        Log.d(TAG, "setListenere: .........");
    }


}
