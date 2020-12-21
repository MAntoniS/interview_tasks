package com.recruitment.first_task;

import java.util.LinkedList;
import java.util.List;

public class ArithmeticAvarage {

    public List<Integer> rewriteArrayToList(int[] array){
        List result = new LinkedList();
        for (int i = 0; i < array.length; i ++){
            if ((i == 0) || (i == array.length - 1)){
                if(i == 0){
                    result.add(countArithmeticAvarage(50,array[i], array[i +1]));
                }
                result.add(countArithmeticAvarage(array[i - 1],array[i], 50));
            }
            result.add(countArithmeticAvarage(array[i - 1],array[i], array[i +1]));
        }
        return result;
    }

    private int countArithmeticAvarage(int previous, int current, int next){
        int avarage = (previous + current + next) / 3;
        return avarage;
    }
}
