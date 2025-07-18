package org.example;

public class Calculator {
    private boolean status = false;

    public boolean isOn() {
        return status;
    }

    public boolean isOff() {
        return !status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }
}
