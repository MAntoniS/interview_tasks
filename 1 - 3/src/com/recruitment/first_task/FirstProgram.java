package com.recruitment.first_task;

import java.util.List;
import java.util.Scanner;

public class FirstProgram {

    private int[] array;
    List<Integer> list;
    ArithmeticAvarage avarage;
    EveryThird everyThird;
    ProductBiggerThanNineThousand biggerThanNineThousand;
    BiggerThanNinety biggerThanNinety;
    Scanner scanner;

    public FirstProgram(){
        array = new ArrayData().getArrayData();
        avarage = new ArithmeticAvarage();
        everyThird = new EveryThird();
        biggerThanNineThousand = new ProductBiggerThanNineThousand();
        biggerThanNinety = new BiggerThanNinety();
        scanner = new Scanner(System.in);
    }

    public void runProgram(){
        System.out.println("Welcome");
        boolean exit = false;
        int choice;
        while(!exit){
            writeInstructions();
            choice = scanner.nextInt();
            exit = chooseOption(exit, choice);
        }
    }

    private boolean chooseOption(boolean exit, int choice) {
        switch (choice){
            case 1 :
                rewriteEveryThird();
                printList();
                break;
            case 2 :
                rewriteAvarage();
                printList();

                break;
            case 3 :
                rewriteBiggerThanNinenty();
                printList();

                break;
            case 4 :
                writeBiggerThanNineThousand();
                break;
            case 5 :
                exit = true;
                break;
            default:
                System.out.println("No such option");
                break;
        }
        return exit;
    }

    private void writeInstructions() {
        System.out.println("If you want to rewrite every third number from array press: 1");
        System.out.println("If you want to rewrite every number from the array as " +
                "\n arithmetic avarage of this number, the previous and the next one press : 2 ");
        System.out.println("if you want to rewrite every number from the array that is grater than 90 press : 3");
        System.out.println("If you want to rewrite every pair of numbers wich product is grater than 9000 press : 4 ");
        System.out.println("If you want to exit press : 5 ");
    }

    private void rewriteEveryThird(){
        list = everyThird.rewriteArrayToList(array);
    }

    private void rewriteAvarage(){
        list = avarage.rewriteArrayToList(array);
    }

    private void rewriteBiggerThanNinenty(){
        list = biggerThanNinety.rewriteArrayToList(array);
    }

    private void writeBiggerThanNineThousand(){
        biggerThanNineThousand.rewriteArrayToList(array);
    }

    private void printList(){
        for (int i: list
             ) {
            System.out.println(i);
        }
    }

}
