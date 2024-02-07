# Задача 2. Сумма и разность

# Напишите две функции. Первая принимает одно целое положительное число N и находит сумму всех цифр в числе. Вторая принимает число N и считает количество цифр в числе. В ответ выводится разность суммы чисел и количества.

# Пример работы программы:
# 
# Введите число: 500
# 
# Сумма чисел: 5
# Количество цифр в числе: 3
# Разность суммы и количества цифр: 2

def summ(number):
  summ = 0
  while number > 0:
    summ = summ + number % 10
    number //= 10
  return summ

def number_of_digits(number):
  count = 0
  while number > 0:
    count += 1
    number //= 10
  return count

def difference(a):
  return summ(a) - number_of_digits(a)

a = int(input("Введите число: "))

print("Сумма чисел:", summ(a))
print("Количество цифр в числе:", number_of_digits(a))
print("Разность суммы и количества цифр:", difference(a))