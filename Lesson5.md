# Занятие №5 Абстракция и проектирование

## Table of Contents

* [Задание: подумать над улучшением кода](#задание-подумать-над-улучшением-кода)
* [Пример 1](#пример-1)
* [Пример 2](#пример-2)
* [Пример 3](#пример-3)

## Задание: подумать над улучшением кода

## Пример 1:

```java
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.05;
        } else if (customerType.equals("vip")) {
            return amount * 0.10;
        } else if (customerType.equals("employee")) {
            return amount * 0.30;
        } else {
            return 0;
        }
    }
}
```

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson5/discountcalculator/Main.java)

[Back to Table of Contents](#table-of-contents)

## Пример 2:

```java
public class Sorter {
    public void sort(int[] array, String algorithm) {
        if (algorithm.equals("bubble")) {
// Реализация пузырьковой сортировки
            System.out.println("Sorting using bubble sort");
        } else if (algorithm.equals("merge")) {
// Реализация сортировки слиянием
            System.out.println("Sorting using merge sort");
        } else if (algorithm.equals("quick")) {
// Реализация быстрой сортировки
            System.out.println("Sorting using quick sort");
        } else {
            throw new IllegalArgumentException("Unsupported sorting algorithm: " + algorithm);
        }
    }
}
```

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson5/sorting/Main.java)

[Back to Table of Contents](#table-of-contents)

## Пример 3:

```java
public class ReportGenerator {
    public void generate(String type) {
        if (type.equals("pdf")) {
            System.out.println("Fetching data for PDF...");
            System.out.println("Formatting data for PDF...");
            System.out.println("Generating PDF report...");
        } else if (type.equals("excel")) {
            System.out.println("Fetching data for Excel...");
            System.out.println("Formatting data for Excel...");
            System.out.println("Generating Excel report...");
        } else {
            System.out.println("Unknown report type.");
        }
    }
}
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson5/reporting/Main.java)

[Back to Table of Contents](#table-of-contents)
