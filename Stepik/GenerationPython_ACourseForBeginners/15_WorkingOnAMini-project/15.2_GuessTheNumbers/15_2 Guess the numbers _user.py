"""
Описание проекта

Программа генерирует случайное число в диапазоне от 1 до 100 и просит
пользователя угадать это число. Если догадка пользователя больше случайного
числа, то программа должна вывести сообщение 'Слишком много, попробуйте еще
раз'. Если догадка меньше случайного числа, то программа должна вывести
сообщение 'Слишком мало, попробуйте еще раз'. Если пользователь угадывает
число, то программа должна поздравить его и вывести сообщение
'Вы угадали, поздравляем!'.
"""

# подключаем модуль math
import math

# создаем две переменные с крайними значениями
left, right = 1, 100

# задаем переменную с вариантом отмета пользователя
answer = 'д'

# основной блок
print('\nПривет! Я угадаю число, которое ты загадал :)')


print('Слишком много, попробуйте еще раз')
print('Слишком мало, попробуйте еще раз')

print('Вы угадали, поздравляем!')