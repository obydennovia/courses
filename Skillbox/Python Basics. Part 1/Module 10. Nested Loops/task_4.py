print('Задача 4. Простые числа')

# Напишите программу, которая считает количество простых чисел в заданной последовательности и выводит ответ на экран.

# Простое число делится только на себя и на единицу. Последовательность задаётся при помощи вызова ввода (input) на каждой итерации цикла. Одна итерация — одно число.

# Пример:
# Введите количество чисел: 6.
# Введите число: 4.
# Введите число: 7.
# Введите число: 20.
# Введите число: 3.
# Введите число: 11.
# Введите число: 37.

# Количество простых чисел в последовательности: 4.

count = 0

number = int(input("Введите количество чисел: "))

for num in range(number):
  num = int(input("Введите число: "))
  for i in range(2, num):
    if num % i == 0:
      break
  else:
    if num > 1:
      count += 1

print("Количество простых чисел в последовательности: ", count)
