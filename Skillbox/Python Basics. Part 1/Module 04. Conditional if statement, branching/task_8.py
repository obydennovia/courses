print('Задача 8. Максимальное число (по желанию)')

# Пользователь вводит три числа.
# Напишите программу,
# которая выводит на экран максимальное из этих трёх чисел (все числа разные).
# Можно использовать дополнительные переменные, если нужно 

number_first = int(input("Введите первое число: "))
number_second = int(input("Введите второе число: "))
number_third = int(input("Введите третье число: "))

if number_first > number_second:
  if number_first > number_third:
    print(number_first)
  else:
    print(number_third)
else:
  if number_second > number_third:
    print(number_second)
  else:
    print(number_third)