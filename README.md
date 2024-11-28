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

## Занятие №2 Основы основ в Java

## Д.з. для занятия №2

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
```
3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/forloop/MultiplicationForNumber.java)

### Задача 4: Факториал числа
Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).

**Пример:**

Введите N: 4

Факториал: 24

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/forloop/Factorial.java)

### Задача 5: Чётные числа до N
Пользователь вводит число N. Выведите все чётные числа от 1 до N.

**Пример:**

Введите N: 10

Чётные числа: 2 4 6 8 10

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/forloop/EvenNumbers.java)

### Задачи на вложенные циклы
### Задача 1: Таблица умножения

Выведите таблицу умножения от 1 до 10 в формате:
```
1 x 1 = 1
1 x 2 = 2
...
10 x 10 = 100
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/nestedloops/MultiplicationTable.java)

### Задача 2: Прямоугольник из звёздочек

Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).

**Пример:**
```
****
****
****
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/nestedloops/StarRectangle.java)


### Задача 3: Пирамида из звёздочек

Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.

**Пример:**
```
   *
  ***
 *****
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/nestedloops/StarPyramid.java)

### Задача 4: Поиск простых чисел
Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.

**Пример:**

Введите N: 10
Простые числа: 2 3 5 7

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/nestedloops/PrimeNumbers.java)

### Задача 5: Шахматная доска
Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..

**Пример:**
```
#.#.
.#.#
#.#.
.#.#
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/nestedloops/Chessboard.java)

### Задачи на классы, конструкторы и ООП-принципы
### Задача 1: Создание класса "Круг"

Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:

* Поле radius (радиус круга).
* Конструктор, который принимает радиус круга.
* Метод getArea(), возвращающий площадь круга (π * r^2).
* Метод getCircumference(), возвращающий длину окружности (2 * π * r).

**Пример использования:**
```java
Circle circle = new Circle(5);
System.out.println("Площадь: " + circle.getArea());
System.out.println("Длина окружности: " + circle.getCircumference());
```
[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson2/oop/circle/Circle.java)

### Задача 2: Класс "Книга"
Создайте класс Book, который описывает книгу:
* Поля: title (название), author (автор), price (цена).
* Конструктор, который принимает все три параметра.
Метод printInfo(), который выводит информацию о книге в формате:
```
Название: <title>, Автор: <author>, Цена: <price>
```

Пример использования:
```java
Book book = new Book("Мастер и Маргарита", "М. Булгаков", 500);
book.printInfo();
```

### Задача 3: Наследование - Класс "Сотрудник" и "Менеджер"
Создайте два класса:
1. Employee (сотрудник) с полями:
* name (имя),
* salary (зарплата).
* Конструктор для инициализации полей.
* Метод printInfo(), выводящий информацию о сотруднике.
2. Manager, который наследуется от Employee:
* Дополнительное поле bonus (премия).
* Переопределите метод printInfo() так, чтобы он выводил и бонус.

Пример использования:
```java
Employee emp = new Employee("Иван", 30000);
Manager mgr = new Manager("Ольга", 50000, 10000);

emp.printInfo(); // Иван: зарплата 30000
mgr.printInfo(); // Ольга: зарплата 50000, бонус 10000
```

### Задача 4: Инкапсуляция - Класс "Банк"
Создайте класс BankAccount, который описывает банковский счёт:
* Поля:
    * accountNumber (номер счёта, String),
    * balance (баланс, double).
* Конструктор для инициализации счёта.
* Методы:
    * deposit(double amount) - увеличивает баланс.
    * withdraw(double amount) - уменьшает баланс (если средств достаточно).
    * getBalance() - возвращает текущий баланс.

Пример использования:
```java
BankAccount account = new BankAccount("12345", 1000.0);
account.deposit(500);
account.withdraw(300);
System.out.println("Баланс: " + account.getBalance());
```

### Задача 5: Полиморфизм - Фигуры
Создайте иерархию классов для фигур:

1. Абстрактный класс Shape:
   * Абстрактный метод double getArea().
   * Абстрактный метод double getPerimeter().
2. Класс Rectangle (прямоугольник), наследуется от Shape:
   * Поля: width (ширина), height (высота).
   * Реализует методы для расчёта площади и периметра.
3. Класс Circle, наследуется от Shape:
   * Поле: radius (радиус).
   * Реализует методы для расчёта площади и периметра.

Пример использования:
```java
Shape rectangle = new Rectangle(4, 5);
Shape circle = new Circle(3);

System.out.println("Площадь прямоугольника: " + rectangle.getArea());
System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
System.out.println("Площадь круга: " + circle.getArea());
System.out.println("Периметр круга: " + circle.getPerimeter());
```

## [Занятие №3 Классы и ООП](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md)

## [Д.з. для занятия №3](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#Дз-для-занятия-№3)

## [Задача 1: Класс для представления прямоугольника](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-1-класс-для-представления-прямоугольника)

## [Задача 2: Класс для представления банковского счета](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-2-класс-для-представления-банковского-счета)

## [Задача 3: Класс для представления единицы товара](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-3-класс-для-представления-единицы-товара)

## [Задача 4: Класс для человека](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-4-класс-для-человека)

## [Задача 5: Класс Student](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-5-класс-student)

## [Задача 6: Класс "Товар"](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-6-класс-товар)

## [Задача 7: Класс животного и наследование](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-7-класс-животного-и-наследование)

## [Задача 8: Банковский счет и принципы ООП](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-8-банковский-счет-и-принципы-ооп)

## [Задача 9: Библиотека](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-9-библиотека)

## [Задача 10: Система управления заказами в интернет-магазине](https://github.com/a-oleynik/interview-training/blob/main/Lesson3.md#задача-10-система-управления-заказами-в-интернет-магазине)
