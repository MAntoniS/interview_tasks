package com.recruitment.third_task;

import com.recruitment.third_task.figures.Figure;

public class AreaComparer {

    public int Compare(Figure figure1, Figure figure2){
        if (figure1.getArea() > figure2.getArea()){
            return -1; }
        if (figure1.getArea() == figure2.getArea()){
            return  0; }
        return 1;
    }
}
