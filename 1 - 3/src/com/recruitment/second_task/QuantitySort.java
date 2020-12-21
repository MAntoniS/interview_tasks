package com.recruitment.second_task;

import com.recruitment.second_task.interfaces.ISortMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class QuantitySort implements ISortMap {

    @Override
    public Map<Character,Integer> sort(Map<Character, Integer> mapToSort) {

        LinkedHashMap<Character,Integer> sortedMap = new LinkedHashMap<>();

        mapToSort.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }
}
