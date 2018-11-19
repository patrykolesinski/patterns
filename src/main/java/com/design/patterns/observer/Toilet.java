package com.design.patterns.observer;

import java.util.Observable;

/**
 * Created by Asus on 03.10.2017.
 */
public class Toilet extends Observable {
    private boolean isBusy;

    public void enter(){
        isBusy = true;
        setChanged();
        notifyObservers(isBusy);
    }

    public void leave(){
        isBusy = false;
        setChanged();
        notifyObservers(isBusy);
    }
}
