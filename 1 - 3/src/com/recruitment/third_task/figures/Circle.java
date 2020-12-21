package com.recruitment.third_task.figures;

public class Circle extends Figure {

    private double r;
    public Circle (double value){
        this.r = value;
        area = calculateArea();
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.sqrt(r);
    }
}
