"""
требуется написать программу, способную шифровать и дешифровать текст в
соответствии с алгоритмом Цезаря. Она должна запрашивать у пользователя
следующие данные:
* направление: шифрование или дешифрование;
* язык алфавита: русский или английский;
* шаг сдвига (со сдвигом вправо).
Примечание 1. Считайте, что в русском языке 32 буквы (буква ё отсутствует).
Примечание 2. Неалфавитные символы — знаки препинания, пробелы, цифры — не
меняются.
Примечание 3. Сохраните регистр символов. Например, текст: "Умом Россию не
понять" при сдвиге на одну позицию вправо будет преобразован в: "Фнпн Спттйя ож
рпоауэ".
Примечание 4. Если пользователь выбрал один язык, а вводит на другом, то это
остается на совести пользователя.
"""

# Задаем четыре вопроса пользователю: шифроавание/дешифрование, язык
# русский/английский, количество символов сдвига, текст для преобразования
# Проверяем корректность ввода ответа

direction = input(
    'Текст нужно: 1 - шифровать или 2 - дешифровать?\n').lower()
while direction != '1' and direction != '2':
    direction = input(
        'Что-то не так. Введи 1 - шифровать или 2 - дешифровать\n').lower()

language = input(
    'Использовать язык: 1 - русский или 2 - английский?\n').lower()
while language != '1' and language != '2':
    language = input(
        'Что-то не так. Введи 1 - русский либо 2 - английский\n').lower()

shift = input('На сколько символовов сдвигаем текст?\n')
while shift.isdigit() != True:
    shift = input('Что-то не так. Нужно число.\n')

text = input('Введи текст для преобразования\n')
while text.isspace() == True:
    text = input('Что-то не так. Введи текст.\n')

# объявляем функцию шифрования с четырьмя переданными аргументами –
# шифровать/дешифровать, русский/английский язык, количество символов сдвига,
# текст для преобразования
def caesar_cipher(direction, language, shift, text):

    # объявляем результирующую строку, в которую пишем преобразованный текст
    result_text = ''

    # четыре словаря под русские и английские символы - строчные и прописные
    upp_eng_abc = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    low_eng_abc = 'abcdefghijklmnopqrstuvwxyz'
    upp_rus_abc = 'АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ'
    low_rus_abc = 'абвгдежзийклмнопрстуфхцчшщъыьэюя'

    # количество итераций равно длине строки text
    for i in range(len(text)):

        # в локальные переменные пишем длину алфавита и значения словарей
        if language == '1':  # русский язык
            letters = 32  # количество символов русского алфавита
            low_abc = low_rus_abc
            upp_abc = upp_rus_abc
        if language == '2':  # английский язык
            letters = 26  # количество символов английского алфавита
            low_abc = low_eng_abc
            upp_abc = upp_eng_abc

        # если text[i] буква:
        if text[i].isalpha():

            # находим место символа text[i] в словаре upp_abc либо low_abc
            if text[i] == text[i].lower():
                place = low_abc.index(text[i])
            if text[i] == text[i].upper():
                place = upp_abc.index(text[i])

            # если дешифруем:
            if direction == '1':
                # находим индекс для сдвинутого символа
                index = (place - int(shift)) % letters
            # если шифруем
            elif direction == '2':
                # находим индекс для сдвинутого символа
                index = (place + int(shift)) % letters

            # заносим сдвинутый символ в результирующее слово
            if text[i] == text[i].lower():
                result_text += low_abc[index]
            if text[i] == text[i].upper():
                result_text += upp_abc[index]

        # если text[i] не буква, то просто заносим этот символ
        # в результирующее слово
        else:
            result_text += text[i]

    # выводим преобразованный текст
    print(result_text)

# Вызываем функцию, передавая в аргументы четыре input`а из начала кода.
caesar_cipher(direction, language, shift, text)
