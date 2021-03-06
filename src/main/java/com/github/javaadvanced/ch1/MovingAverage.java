package com.github.javaadvanced.ch1;

public class MovingAverage {
    private int count = 0;
    private double sum = 0.0;

    public void submit(double value) {
        this.count++;
        this.sum += value;
    }

    public double getAvg() {
        if (this.count == 0) {
            return sum;
        }
        return this.sum / this.count;
    }
}
