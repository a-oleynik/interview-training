# Занятие №3 Классы и ООП
## Д.з. для занятия №3

## Задача 1: Класс для представления прямоугольника
**Описание:**
Создайте класс Rectangle, который будет представлять прямоугольник.
**Класс должен содержать:**
1. Два поля: ширина (width) и высота (height).
2. Конструктор для инициализации ширины и высоты.
3. Методы:
    * getArea(): возвращает площадь прямоугольника.
    * getPerimeter(): возвращает периметр прямоугольника.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/rectangle/Rectangle.java)

## Задача 2: Класс для представления банковского счета
**Описание:**
Создайте класс BankAccount, который будет представлять банковский счет.

Класс должен содержать:
1. Поля:
    * Номер счета (accountNumber).
    * Баланс (balance).
2. Методы:
    * deposit(double amount): пополнение счета.
    * withdraw(double amount): снятие денег с проверкой на достаточность средств.
    * getBalance(): возвращает текущий баланс.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/simplebankaccount/BankAccount.java)

## Задача 3: Класс для представления единицы товара
**Описание:**
Создайте класс Item, который будет представлять товар.

Класс должен содержать:
1. Поля:
    * Название товара (name).
    * Цена товара (price).
    * Количество на складе (quantity).
2. Методы:
    * sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
    * restock(int amount): добавляет указанное количество на склад.
    * getInfo(): возвращает строку с информацией о товаре.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/item/Item.java)

## Задача 4: Класс для человека
**Описание задачи:**
Создайте класс Person, который будет представлять человека. Класс должен содержать:
* Поля:
    * Имя (name) — строка.
    * Возраст (age) — целое число.
    * Пол (gender) — строка (например, "мужчина" или "женщина").
    * Город (city) — строка.
* Несколько конструкторов:
    * Конструктор, принимающий только имя.
    * Конструктор, принимающий имя и возраст.
    * Конструктор, принимающий все поля.
* Методы:
    * Геттеры и сеттеры для всех полей.
    * Переопределите методы equals и hashCode так, чтобы люди считались равными, если у них совпадают имя и возраст.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/person/Person.java)

## Задача 5: Класс Student
Создайте класс Student, который будет представлять студента.
**Требования:**
1. Поля:
    * Имя (name).
    * ID студента (id).
    * Средний балл (gpa).
2. Реализуйте:
    * Конструкторы:
        * По умолчанию (без параметров).
        * Конструктор для инициализации всех полей.
    * equals и hashCode: два студента считаются равными, если у них совпадают id.
    * toString: метод, возвращающий строку с информацией о студенте (например, "Student{id=101, name='Anna', gpa=3.8}").
    * clone: создайте глубокую копию объекта.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/student/Student.java)

## Задача 6: Класс "Товар"
**Описание:**
Создайте класс Product, который будет представлять товар.

Класс должен содержать:
1. Поля:
    * Название (name) — строка.
    * Цена (price) — double.
    * Уникальный идентификатор (id) — int.
2. Конструкторы:
    * Конструктор по умолчанию.
    * Конструктор с параметрами.
3. Методы:
    * Переопределите equals и hashCode так, чтобы товары считались равными, если совпадают их id.
    * Переопределите toString для вывода информации о товаре.
    * Реализуйте clone для копирования товара.

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/product/Product.java)

## Задача 7: Класс животного и наследование
**Описание:**
Создайте классы Animal (животное) и Dog (собака). Используйте принцип наследования:
1. Animal — базовый класс, содержащий:
    * Поля: name (имя животного) и age (возраст).
    * Метод makeSound(), который выводит строку: "Животное издает звук".
2. Dog — подкласс, наследующий Animal:
    * Переопределяет метод makeSound() для вывода строки: "Собака лает".
    * Добавляет метод fetch() с выводом строки: "Собака приносит палку".

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson3/homework/animals/Dog.java)

## Задача 8: Банковский счет и принципы ООП
**Описание:**
Создайте приложение для управления банковскими счетами, которое включает следующие классы:
1. Абстрактный класс BankAccount:
    * Поля: accountNumber (номер счета), balance (баланс).
    * Методы:
        * Абстрактный метод calculateInterest().
        * Реализация метода deposit(double amount) для пополнения счета.
        * Реализация метода withdraw(double amount) с проверкой на достаточность средств.
2. Класс SavingsAccount:
    * Наследуется от BankAccount.
    * Реализует метод calculateInterest(), добавляя 5% годовых к балансу.
3. Класс CheckingAccount:
    * Наследуется от BankAccount.
    * Реализует метод calculateInterest() без начисления процентов.
4. Инкапсуляция:
    * Поля accountNumber и balance должны быть приватными, с геттерами и сеттерами.
5. Полиморфизм:
    * Используйте массив объектов BankAccount, чтобы показать работу методов для разных типов счетов.

