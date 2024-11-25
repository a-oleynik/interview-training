![Last commit](https://img.shields.io/github/last-commit/a-oleynik/interview-training?style=for-the-badge&color=9cf&logo=git)
![GitHub top language](https://img.shields.io/github/languages/top/a-oleynik/interview-training?style=for-the-badge&color=blue)

# Экспресс Собесы - интенсив

## Занятие №1 Типичные ошибки на собесах

## Лайвкодинг задачи

### Задача 1
Написать функцию, которая принимает массив чисел и возвращает сумму его элементов.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson1/ArraySum.java)

### Задача 2
Написать метод, который принимает строку и возвращает её в обратном порядке.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson1/ReversedString.java)

## Лайвкодинг посложнее задачи
### Задача 1
Напишите функцию, которая проверяет, является ли переданная строка палиндромом (читается одинаково в обоих направлениях).

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson1/Palindrome.java)

### Задача 2
Разработать метод, который по заданному числу N создает матрицу N x N, заполненную числами от 1 до N^2 по спирали начиная от верхнего левого угла.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson1/Spiral.java)

### Задача

Реализовать универсальный класс **Cache**, который может хранить элементы разных типов. Класс должен поддерживать операции добавления элемента, получения элемента по ключу и удаления элемента по ключу.

#### Основные требования и подходы
1.  Класс Cache должен быть типизирован.
* Используйте generics для типизации класса, так чтобы он мог работать с любым типом данных.
2. Хранение элементов.
* Используйте HashMap для хранения элементов, где ключ и значение могут быть различных типов.
3. Методы для работы с кэшем:
* public void put(K key, V value) - добавляет элемент в кэш.
* public V get(K key) - возвращает элемент по ключу, если элемент не найден, возвращает null.
* public void remove(K key) - удаляет элемент по указанному ключу.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson1/Cache.java)

## Lesson №2

## Homework for Lesson №2

### Базовые операции в Java

### Задача 1: Сложение и вычитание чисел
Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.

**Пример ввода:**

10

5

**Пример вывода:**

Сумма: 15

Разность: 5

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/basicoperations/AdditionAndSubtraction.java)


### Задача 2: Площадь прямоугольника
Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.

**Пример:**

Ширина: 4

Длина: 6

Площадь: 24

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/basicoperations/RectangleArea.java)

### Задача 3: Операции с остатком от деления
Запросите у пользователя два числа и выведите результат их деления и остаток от деления.

**Пример:**

Введите первое число: 17

Введите второе число: 3

Результат деления: 5

Остаток: 2

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/basicoperations/DivisionWithRemainder.java)

### Задача 4: Перевод градусов Цельсия в Фаренгейты
Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
Формула: F = C * 9/5 + 32.

**Пример:**

Введите температуру в Цельсиях: 25

Температура в Фаренгейтах: 77

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/basicoperations/CelsiusFahrenheit.java)

### Задача 5: Обмен значениями переменных
Поменяйте значения двух переменных местами без использования третьей переменной.

**Пример:**

До обмена: a = 5, b = 10

После обмена: a = 10, b = 5

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/basicoperations/ExchangeValuesOfVariable.java)

### Задачи на if и switch
### Задача 1: Проверка чётности числа
Напишите программу, которая проверяет, является ли число чётным или нечётным.

**Пример:**

Введите число: 8

Результат: Чётное

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/ifswitch/CheckIfEven.java)

### Задача 2: Калькулятор с использованием switch
Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.

**Пример:**

Введите первое число: 7

Введите оператор: *

Введите второе число: 3

Результат: 21

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/ifswitch/Calculator.java)


### Задача 3: Определение времени года
Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.

**Пример:**

Введите номер месяца: 12

Результат: Зима

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/ifswitch/Season.java)


### Задача 4: Проверка возраста
Напишите программу, которая определяет категорию человека по возрасту:

0-12: Ребёнок
13-17: Подросток
18-64: Взрослый
65+: Пенсионер.

Используйте if-else.

**Пример:**

Введите возраст: 30

Результат: Взрослый

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/ifswitch/AgeCategory.java)

### Задача 5: Проверка делимости
Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.

**Пример:**

Введите число: 15

Результат: Делится на 3 и 5

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/ifswitch/Divisibility35.java)

### Задачи на for
### Задача 1: Вывод чисел от 1 до 10
Напишите программу, которая выводит все числа от 1 до 10.

**Пример вывода:**

1 2 3 4 5 6 7 8 9 10

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/forloop/OutputFRom1To10.java)

### Задача 2: Сумма чисел от 1 до N
Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.

**Пример:**

Введите N: 5

Сумма: 15

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/forloop/ArithmeticProgression.java)

### Задача 3: Таблица умножения для числа
Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.

**Пример:**

Введите число: 3

3 x 1 = 3

3 x 2 = 6

...

3 x 10 = 30

### Задача 4: Факториал числа
Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).

**Пример:**

Введите N: 4

Факториал: 24

### Задача 5: Чётные числа до N
Пользователь вводит число N. Выведите все чётные числа от 1 до N.

**Пример:**

Введите N: 10

Чётные числа: 2 4 6 8 10
