print('Задача 1. Датчик погоды')

# В за окном квартиры стоит датчик погоды, который определяет, идёт ли дождь. Если идёт, датчик оповещает сообщением: «Пошёл дождь. Возьмите зонтик!»

# Напишите программу, которая получает на вход число 0 или 1. Единица означает, что дождь идёт. В таком случае выводите на экран сообщение: «Пошёл дождь. Возьмите зонтик!». Ноль означает, что дождя нет, в этом случае надо вывести сообщение «Дождя нет!»

# Пример 1:
# На улице идёт дождь? 1
# Пошёл дождь. Возьмите зонтик!

# Пример 2:
# На улице идёт дождь? 0
# Дождя нет!

number = int(input("На улице дождь: "))

if number == 0:
  print("Дождя нет!")
if number == 1:
  print("Пошёл дождь. Возьмите зонтик!")