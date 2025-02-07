# Занятие №6 Комплексные задачи на проектирование

## Table of Contents

* [Задача 1](#задача-1)
* [Задача 2](#задача-2)
* [Задача 4](#задача-4)

## Задача 1:

*Двусуммный (Two Sum)*: Дан массив целых чисел nums и целое число target. Найдите два числа в массиве так, чтобы их сумма была равна target. Верните их индексы. Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды. Вы можете вернуть ответ в любом порядке.

*Вход*: nums = [2, 7, 11, 15], target = 9 

*Выход*: [0, 1] 

*Выход объяснение*: nums[0] + nums[1] == 9, мы возвращаем [0, 1].

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson6/TwoSum.java)

[Livecode Video](https://www.youtube.com/watch?v=ED2CVzR3kM0)

[Back to Table of Contents](#table-of-contents)

## Задача 2:
*Обращение связанного списка (Reverse Linked List)*:
Обратите связанный список.

*Пример*:

*Вход*: 1->2->3->4->5->NULL

*Выход*: 5->4->3->2->1->NULL

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson6/reverselinkedlist/Solution.java)

[Livecode Video](https://www.youtube.com/watch?v=skmuxgLeNwQ)

[Back to Table of Contents](#table-of-contents)

## Задача 4:
Объединение двух отсортированных массивов (Merge Sorted Array):
Даны два отсортированных массива nums1 и nums2 размерами m и n соответственно. nums1 имеет достаточно места (размер равен m + n), чтобы вместить дополнительные элементы из nums2. Объедините элементы nums2 в nums1 так, чтобы новый массив nums1 остался отсортированным.
*Пример*:
*Вход*:

nums1 = [1,2,3,0,0,0], m = 3

nums2 = [2,5,6],       n = 3

*Выход*:

[1,2,2,3,5,6]

[Решение](https://github.com/a-oleynik/interview-training/tree/main/src/main/java/com/oleynik/interviewtraining/lesson6/mergesortedarray/Solution.java)

[Livecode Video](https://www.youtube.com/watch?v=6KI6nzb7cNA)

[Back to Table of Contents](#table-of-contents)
