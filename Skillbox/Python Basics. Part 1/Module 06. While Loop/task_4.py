print('Задача 4. Поставьте оценку!')

# Вася выложил своё новое приложение на платформу для начинающих разработчиков,
# на ней пользователи могут ставить оценку приложению от −100 до 100.
# Ему захотелось сравнить количество положительных и отрицательных отзывов,
# для этого он заранее отфильтровал все отзывы так,
# чтобы в конце были те, которые равны нулю.
 
# Напишите программу,
# которая находит количество положительных
# и количество отрицательных чисел в последовательности.
# Последовательность заканчивается на числе 0.
 
# Пример:
# Введите число: −4
# Введите число: −90
# Введите число: 6
# Введите число: 0
# Кол-во положительных чисел: 1
# Кол-во отрицательных чисел: 2

count_positive = 0
count_negative = 0

while True:
  number = int(input("Введите число: "))
  if number > 0:
    count_positive += 1
  elif number < 0:
    count_negative += 1
  else:
    break
print("Кол-во положительных чисел:", count_positive)
print("Кол-во отрицательных чисел:", count_negative)