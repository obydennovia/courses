print('Задача 5. Текстовый редактор')

# Мы продолжаем разрабатывать новый текстовый редактор,
# и в этот раз нам поручили написать для него код,
# который считает количество любой буквы 
# и любой цифры в тексте (а не только буквы Ы как раньше).

# Напишите функцию count_letters,
# которая принимает на вход текст и подсчитывает,
# какое в нём количество цифр K и букв N.

# Функция должна вывести на экран информацию
# о найденных буквах и цифрах в определенном формате.

# Пример:
# Введите текст: 100 лет в обед
# Какую цифру ищем? 0
# Какую букву ищём? л
# 
# Количество цифр 0: 2
# Количество букв л: 1

def count_letters(text, number, letter):
  count_number = 0
  count_letter = 0
  for symbol in text:
    if symbol == number:
      count_number += 1
    elif symbol == letter:
      count_letter += 1
  print("Количество цифр", number, ":", count_number)
  print("Количество букв", letter, ":", count_letter)

text = input("Введите текст: ")
number = input("Какую цифру ищем? ")
letter = input("Какую букву ищем? ")

count_letters(text, number, letter) 