print('Задача 8. Яма ')

# Представьте, что вы разрабатываете компьютерную игру с текстовой графикой. Вам поручили создать генератор ландшафта. Напишите программу, которая получает на вход число N и выводит на экран числа в виде ямы:

# Напишите программу,
# которая получает на вход число N и выводит на экран числа в виде “ямы”:

# Введите число: 5
#
# 5........5
# 54......45
# 543....345
# 5432..2345
# 5432112345

number = int(input("Введите число: "))

for row in range(number):
  for col in range(number, number - row - 1, -1):
    print(col, end = "")
  dot = 2 * (number - row - 1)
  print("." * dot, end = "")
  for col in range(number - row, number + 1):
    print(col, end = "")
  print()