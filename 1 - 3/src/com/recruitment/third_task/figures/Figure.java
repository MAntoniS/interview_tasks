package com.recruitment.third_task.figures;

public abstract class Figure {

    protected double area;

    public double getArea(){
        return area;
    }

    protected abstract double calculateArea();
}
