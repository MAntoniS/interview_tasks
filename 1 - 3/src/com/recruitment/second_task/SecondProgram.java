package com.recruitment.second_task;

import com.recruitment.second_task.interfaces.IFileReader;
import com.recruitment.second_task.interfaces.ISortMap;

import java.util.Map;
import java.util.Scanner;

public class SecondProgram {
    private ISortMap sortMap;
    private IFileReader reader;
    private CountCharacters countCharacters;
    private Map<Character,Integer> characterAppearanceMap;
    private Scanner scanner;

    public SecondProgram(String path){
        reader = new ReadFile(path);
        countCharacters = new CountCharacters(reader.readFile());
        characterAppearanceMap = countCharacters
                .appearanceCount();
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

    private void writeInstructions() {
        System.out.println("If you want to sort the collection alphabetically press : 1");
        System.out.println("if you want to sort the collection by quantity press  : 2");
        System.out.println("If you want to know the number of character appearance press : 3 ");
        System.out.println("If you want to exit press : 4 ");
    }

    private boolean chooseOption(boolean exit, int choice) {
        switch (choice){
            case 1 :
                alphabeticalSort();
                printMap();
                break;
            case 2 :
                quantitySort();
                printMap();
                break;
            case 3 :
                printCharacterAppearance();
                break;
            case 4 :
                exit = true;
                break;
            default:
                System.out.println("No such option");
                break;
        }
        return exit;
    }

    private void printMap(){
        for (Map.Entry<Character,Integer> entry :
                characterAppearanceMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private void alphabeticalSort(){
        sortMap = new AlphabeticSort();
        characterAppearanceMap = sortMap.sort(characterAppearanceMap);
    }

    private void quantitySort(){
        sortMap = new QuantitySort();
        characterAppearanceMap = sortMap.sort(characterAppearanceMap);
    }

    private void printCharacterAppearance(){
        int totalCharacterNumber = countCharacters.totalCharacterNumber();
        for (Map.Entry<Character,Integer> entry :
                characterAppearanceMap.entrySet()) {
            double appearancePercantage = countCharacters.countPercentage(entry.getValue(),totalCharacterNumber);
            System.out.println(
                    entry.getKey() + " - "
                            + entry.getValue() + " / "
                            + appearancePercantage
                            + "%" );
        }
    }
}
