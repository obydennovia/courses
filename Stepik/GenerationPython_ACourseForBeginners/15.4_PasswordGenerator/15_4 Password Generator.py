"""
Программа генерирует заданное количество паролей и включает в себя умную
настройку на длину пароля, а также на то, какие символы требуется в него
включить, а какие исключить.

Программа должна запрашивать у пользователя следующую информацию:
1. Количество паролей для генерации.
2. Длину одного пароля.
3. Включать ли цифры 0123456789?
4. Включать ли прописные буквы ABCDEFGHIJKLMNOPQRSTUVWXYZ?
5. Включать ли строчные буквы abcdefghijklmnopqrstuvwxyz?
6. Включать ли символы !#$%&*+-=?@^_?
7. Исключать ли неоднозначные символы il1Lo0O?
"""

# функция, генерирующая пароли
def generate_password(chars, pass_len):
    password = ''
    for i in range(pass_len):
        password += random.choice(chars)

    return password

# подключаем модуль random для генерации случайных чисел
import random

# создаем строковые константы
digits = '0123456789'
lowercase_letters = 'abcdefghijklmnopqrstuvwxyz'
uppercase_letters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
punctuation = '!#$%&*+-=?@^_'

# создаем строковую переменную, содержащую все символы, которые могут быть в
# генерируемом пароле
chars = ''

# строка, содержащая удовлетворяющую пользователей символы
chars_result = ''

pwd_quantity = int(input('Сколько паролей вам нужно сгенерировать? '))
pwd_len = int(input('Какой длины должен быть пароль? '))

while chars == '':
    pwd_digits = input('Включать ли в пароль цифры от 0 до 9? [y/n] ')
    pwd_uppercase = input('Включать ли в пароль прописные буквы? [y/n] ')
    pwd_lowercase = input('Включать ли в пароль строчные буквы? [y/n] ')
    pwd_punctuation = input(
        'Включать ли в пароль символы "!#$%&*+-=?@^_"? [y/n] ')

    if pwd_digits == 'y':
        chars += digits
    if pwd_uppercase == 'y':
        chars += uppercase_letters
    if pwd_lowercase == 'y':
        chars += lowercase_letters
    if pwd_punctuation == 'y':
        chars += punctuation

    if chars == '':
        print('\nНужно задать хотя бы один параметр\n')

pwd_exceptions = input('Исключать ли неоднозначные символы "il1Lo0O"? [y/n] ')
if pwd_exceptions == 'y':
    for i in range(len(chars)):
        if chars[i] not in 'il1Lo0O':
            chars_result += chars[i]
if pwd_exceptions == 'n':
    chars_result = chars

for _ in range(pwd_quantity):
    print(generate_password(chars_result, pwd_len))
print(chars_result)
