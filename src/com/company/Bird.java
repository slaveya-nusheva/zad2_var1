package com.company;

public class Bird extends Animal{
    public double highOgFlight;

    Bird() {
        this.highOgFlight = 0;
    }

    Bird(double highOgFlight) {
        this.highOgFlight = highOgFlight;
    }

    public double getHighOgFlight() {
        return highOgFlight;
    }

    public void setHighOgFlight(double highOgFlight) {
        this.highOgFlight = highOgFlight;
    }
}
