package com.recruitment.third_task.figures;

public class Cube extends Block{

    private double a;

    public Cube(double a) {

        this.a = a;
        volume = calculateVolume();
        area = calculateArea();
    }


    // TODO: change math to use a function rather than this abomination you moron
    @Override
    protected double calculateVolume() {
        return Math.pow(a,3);
    }

    @Override
    protected double calculateArea() {
        return 6 * Math.sqrt(a);
    }
}
