package com.recruitment.first_task;

import java.util.LinkedList;
import java.util.List;

public class ArithmeticAvarage {

    public List<Integer> rewriteArrayToList(int[] array){
        List result = new LinkedList();
        int index = 1;
        result.add(countArithmeticAvarage(50,array[index -1], array[index]));

        while (index < array.length - 1){

                result.add(countArithmeticAvarage(array[index - 1],array[index], array[index +1]));
                index ++;
            }

        result.add(countArithmeticAvarage(array[index - 1],array[index], 50));


        return result;
    }

    private int countArithmeticAvarage(int previous, int current, int next){
        int avarage = (previous + current + next) / 3;
        return avarage;
    }
}
