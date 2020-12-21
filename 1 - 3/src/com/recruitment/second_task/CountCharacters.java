package com.recruitment.second_task;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    private String file;

    public CountCharacters(String file){
        this.file = file;
    }

    public int totalCharacterNumber(){
        return file.length();
    }

    // TODO: Read and make sure it works correctly
    public Map<Character, Integer> appearanceCount(){
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char current : file.toCharArray()){
            if (characterMap.containsKey(current)){
                int count = characterMap.get(current) + 1;

                characterMap.replace(current,count);
            }else characterMap.put(current,1);
        }

        return characterMap;
    }

    public double countPercentage(int a, int total ){
        return a * 100 / total;
    }

}
