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
makefile
Copy code

Ширина: 4
Длина: 6
Площадь: 24


### Задача 3: Операции с остатком от деления
Запросите у пользователя два числа и выведите результат их деления и остаток от деления.

**Пример:**
makefile
Copy code

Введите первое число: 17
Введите второе число: 3
Результат деления: 5
Остаток: 2


### Задача 4: Перевод градусов Цельсия в Фаренгейты
Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
Формула: F = C * 9/5 + 32.

**Пример:**
Copy code

Введите температуру в Цельсиях: 25
Температура в Фаренгейтах: 77


### Задача 5: Обмен значениями переменных
Поменяйте значения двух переменных местами без использования третьей переменной.

**Пример:**
less
Copy code
До обмена: a = 5, b = 10
После обмена: a = 10, b = 5




