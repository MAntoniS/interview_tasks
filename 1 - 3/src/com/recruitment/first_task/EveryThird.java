package com.recruitment.first_task;

import java.util.LinkedList;
import java.util.List;

public class EveryThird {

    public List<Integer> rewriteArrayToList(int[] array){
        List<Integer> result = new LinkedList();
        for(int i = array.length; i >= 0; i --){
            if((i + 1) % 3 == 0){
                result.add(array[i]);
            }
        }
        return result;
    }
}
