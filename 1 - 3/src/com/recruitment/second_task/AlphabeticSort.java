package com.recruitment.second_task;

import com.recruitment.second_task.interfaces.ISortMap;

import java.util.Map;
import java.util.TreeMap;

public class AlphabeticSort implements ISortMap {

    @Override
    public Map<Character,Integer> sort(Map<Character, Integer> mapToSort) {

        TreeMap<Character,Integer> sortedMap = new TreeMap<Character,Integer>(mapToSort);

        return sortedMap;
    }
}
