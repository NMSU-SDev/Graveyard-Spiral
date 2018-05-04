package com.example.shane.myapplication;

import android.app.Application;

public class GlobalTracker extends Application {

    private int globalVariable;

    public int getGlobalVariable(){
        return globalVariable;
    }

    public void setGlobalVariable() {
        globalVariable++;
    }
}
