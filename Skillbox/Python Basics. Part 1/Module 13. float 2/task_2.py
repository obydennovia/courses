print('Задача 2. Функция максимума')

# Юра пишет различные полезные функции для Python, чтобы остальным программистам стало проще работать. Он захотел написать функцию, которая будет находить максимум из перечисленных чисел. Функция для нахождения максимума из двух чисел у него уже есть. Юра задумался: может быть, её можно как-то использовать для нахождения максимума уже от трёх чисел?

# Помогите Юре написать программу, которая находит максимум из трёх чисел. Для этого используйте только функцию нахождения максимума из двух чисел.

# По итогу в программе должны быть реализованы две функции:
# 1) maximum_of_two — функция принимает два числа и возвращает одно (наибольшее из двух);
# 2) maximum_of_three — функция принимает три числа и возвращает одно (наибольшее из трёх); при этом она должна использовать для сравнений первую функцию maximum_of_two.

def maximum_of_two(number_first, number_second):
  if number_first > number_second:
    return number_first
  else:
    return number_second

def maximum_of_three(number_first, number_second, number_third):
  if maximum_of_two(number_first, number_second) > number_third:
    return maximum_of_two(number_first, number_second)
  else:
    return number_third

number_first = int(input("Введите первое число: "))
number_second = int(input("Введите второе число: "))
number_third = int(input("Введите третье число: "))

print("Максимальное число:", maximum_of_three(number_first, number_second, number_third))