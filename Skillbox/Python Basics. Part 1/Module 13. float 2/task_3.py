print('Задача 3. Число наоборот 2')

# Пользователь вводит два числа — N и K.
# Напишите программу,
# которая заменяет каждое число на число,
# которое получается из исходного записью его цифр в обратном порядке,
# затем складывает их,
# снова переворачивает и выводит ответ на экран.

# Пример:

# Введите первое число: 102
# Введите второе число: 123

# Первое число наоборот: 201
# Второе число наоборот: 321
 
# Сумма: 522
# Сумма наоборот: 225

def reverse(number):
  reverse_number = 0
  while number > 0:
    digit = number % 10
    number //= 10
    reverse_number *= 10
    reverse_number += digit
  return reverse_number

number_first = int(input("Введите первое число: "))
number_second = int(input("Введите второе число: "))

reverse_number_first = reverse(number_first)
reverse_number_second = reverse(number_second)
print()
print("Первое число наоборот:", reverse_number_first)
print("Второе число наоборот:", reverse_number_second)

print()
print("Сумма:", reverse_number_first + reverse_number_second)
print("Сумма наоборот:", reverse(reverse_number_first + reverse_number_second))