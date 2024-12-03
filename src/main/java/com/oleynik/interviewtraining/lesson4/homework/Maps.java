package com.oleynik.interviewtraining.lesson4.homework;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "Hello, World!111";
        Map<Character, Integer> map = charFrequency(s);
        System.out.println(map);
    }
}
