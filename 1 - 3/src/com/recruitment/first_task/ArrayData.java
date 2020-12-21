package com.recruitment.first_task;

import java.util.Random;

public class ArrayData {

    public int[] getArrayData(){
        int[] populateArray = new int[200];
        for(int i = 0; i < 200; i ++){
            populateArray[i] = getRandomNumber();
        }
        return populateArray;
    }

    private int getRandomNumber(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        return  randomNumber;
    }
}
