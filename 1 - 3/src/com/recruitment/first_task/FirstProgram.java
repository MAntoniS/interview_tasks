package com.recruitment.first_task;

import java.util.List;

public class FirstProgram {

    private int[] array;
    List<Integer> list;
    ArithmeticAvarage avarage;
    EveryThird everyThird;
    ProductBiggerThanNineThousand biggerThanNineThousand;
    BiggerThanNinety biggerThanNinety;

    public FirstProgram(){
        array = new ArrayData().getArrayData();
        everyThird = new EveryThird();
        biggerThanNineThousand = new ProductBiggerThanNineThousand();
        biggerThanNinety = new BiggerThanNinety();
    }

    public void rewriteEveryThird(){
        list = everyThird.rewriteArrayToList(array);

    }
    public void rewriteAvarage(){
        list = avarage.rewriteArrayToList(array);
    }

    public void rewriteBiggerThanNinenty(){
        list = biggerThanNinety.rewriteArrayToList(array);
    }

    public void writeBiggerThanNineThousand(){
        biggerThanNineThousand.rewriteArrayToList(array);
    }



}
