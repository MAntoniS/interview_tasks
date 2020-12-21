package com.recruitment.third_task.figures;

public abstract class Block extends Figure {

    protected double volume;

    public double getVolume(){ return volume;}

    protected abstract double calculateVolume();
}
