package com.example.shane.myapplication;

import android.app.Application;

public class GlobalTracker extends Application {

    public int globalVariable = 0;

    public int getGlobalVariable(){
        return globalVariable;
    }

    public void setGlobalVariable() {
        globalVariable++;
    }
}
