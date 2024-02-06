print('Задача 3. Апгрейд калькулятора')

# Степан использует калькулятор для расчёта суммы и разности чисел, но на работе ему требуются не только обычные арифметические действия. 
# Он ничего не хочет делать вручную, поэтому решил немного расширить функционал калькулятора.

# Напишите программу, запрашивающую у пользователя число и действие, которое нужно сделать с числом: вывести сумму его цифр, максимальную или минимальную цифру. 

# Каждое действие оформите в виде отдельной функции, а основную программу зациклите.

# Запрошенные числа должны передаваться в функции суммы, максимума и минимума при помощи аргументов.

def summ_numbers(number):
  summ = 0
  while number > 0:
    summ += number % 10
    number //= 10
  print("Сумма цифр числа равна:", summ)
  print()

def max_number(number):
  max_number = 0
  while number > 0:
    if number % 10 > max_number:
      max_number = number % 10
    number //= 10
  print("Максимальная цифра числа равна:", max_number)
  print()

def min_number(number):
  min_number = number
  while number > 0:
    if number % 10 < min_number:
      min_number = number % 10
    number //= 10
  print("Минимальная цифра числа равна:", min_number)
  print()

def main_menu():
  number = int(input("Введите число: "))
  print()
  print("Что сделать с числом? 1 - вывести сумму его цифр, 2 - вывести максимальную цифру, 3 - вывести минимальную цифру")
  choise = int(input("Введите номер действия: "))
  if choise == 1:
    summ_numbers(number)
  elif choise == 2:
    max_number(number)
  elif choise == 3:
    min_number(number)
  else:
    print("Ошибка ввода. Ведите 1, 2 или 3")
    print()
  main_menu()

main_menu()