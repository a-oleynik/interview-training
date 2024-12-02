package com.oleynik.interviewtraining.lesson4.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {
    /*
    Написать функцию, использующую стек для проверки правильности последовательности скобок в строке
    (например, "([]{})" является правильной, а "([)]" — нет).
     */
    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char currentChar;
        char check;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                deque.push(currentChar);
                continue;
            }
            if (deque.isEmpty())
                return false;
            switch (currentChar) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = deque.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }

        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("([)]"));
    }

}
