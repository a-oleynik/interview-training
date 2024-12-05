# Занятие №5 Абстракция и проектирование
## Table of Contents
* [Задание: подумать над улучшением кода](#задание-подумать-над-улучшением-кода)
* [Пример 1](#пример-1)

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

