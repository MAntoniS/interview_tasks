package com.recruitment.first_task;

public class ProductBiggerThanNineThousand {


    public void rewriteArrayToList(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                int product = array[i] * array[j];
                if (product > 9000) System.out.println
                        ("(" + i + ", " + j + ")");
            }
        }
    }
}
