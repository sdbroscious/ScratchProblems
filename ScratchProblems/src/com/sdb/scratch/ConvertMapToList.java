package com.sdb.scratch;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertMapToList {
	
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        
        System.out.println("\n1. Export Map Key to List...");
        
        List<Integer> result = map.entrySet().stream()
                .map(x -> x.getKey())
                .collect(Collectors.toList());
        
        result.forEach(System.out::println);
        
        System.out.println("\n2. Export Map Value to List...");
        
        List<String> result2 = map.entrySet().stream()
                .map(x -> x.getValue())
                .collect(Collectors.toList());
        
        result2.forEach(System.out::println);
    }

}
