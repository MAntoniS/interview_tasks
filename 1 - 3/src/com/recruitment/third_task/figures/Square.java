package com.recruitment.third_task.figures;

public class Square extends Figure {

    private double a;

    public Square(double value){
        this.a = value;
        area = calculateArea();
    }

    @Override
    protected double calculateArea() {
        return Math.sqrt(a);
    }
}
