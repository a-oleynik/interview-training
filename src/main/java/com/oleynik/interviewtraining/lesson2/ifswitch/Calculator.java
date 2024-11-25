package com.oleynik.interviewtraining.lesson2.ifswitch;

import java.util.Scanner;

public class Calculator {
    public static void calculate(int number1, char operation, int number2) {


        switch (operation) {
            case '+':
                System.out.println("Результат: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Результат: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Результат: " + (number1 * number2));
                break;
            case '/':
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на 0.");
                } else {
                    System.out.println("Результат: " + (number1 / number2));
                }
                break;
            default:
                throw new IllegalArgumentException("Неизвестный оператор");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите оператор (+ - * /)");
        String operation = scanner.nextLine();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        calculate(number1, operation.strip().charAt(0), number2);
    }
}
