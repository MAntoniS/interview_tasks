package com.recruitment.third_task.figures;

public class Sphere extends Block {

    private double r;

    public Sphere(double r) {
        this.r = r;
        volume = calculateVolume();
        area = calculateArea();
    }

    @Override
    protected double calculateVolume() {
        return (4/3) *  Math.PI * Math.pow(r,3);
    }

    @Override
    protected double calculateArea() {
        return 4 * Math.PI  * Math.sqrt(r);
    }
}
