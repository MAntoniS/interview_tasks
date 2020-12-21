package com.recruitment.first_task;

import java.util.LinkedList;
import java.util.List;

public class BiggerThanNinety {
    public List<Integer> rewriteArrayToList(int[] array){
        List result = new LinkedList();

        for (int number:
                array) {
            if (number > 90){
                result.add(number);
            }
        }
        return result;
    }
}
