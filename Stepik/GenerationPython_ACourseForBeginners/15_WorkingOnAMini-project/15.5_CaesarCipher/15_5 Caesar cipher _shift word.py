"""
На вход программе подается строка текста на английском языке, в которой нужно
зашифровать все слова. Каждое слово строки следует зашифровать с помощью шифра
Цезаря (циклического сдвига на длину этого слова). Строчные буквы при этом
остаются строчными, а прописные – прописными.
"""

text = input('Введи текст, который нужно зашифрвать \n')
while text.isspace() == True:
    text = input('Что-то пошло не так. Введи текст еще раз \n')

# Функция сдвига на длину слова без учета небуквенных символов
def caesar_shift_word(text):
    # создаем список из введенных слов, разделенных пробелом
    text_list = text.split()

    # объявляем два английских словаря с прописными и строчными буквами
    upp_abc = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    low_abc = 'abcdefghijklmnopqrstuvwxyz'
    # объявляем количество букв алфавита
    alphas = 26
    # объявляем результирующее слово
    result_text = ''

    # В цикле for количество итераций равно длине слова списка text_list
    for i in range(len(text_list)):
        len_word = 0  # обнуляем счетчик длины каждого слова - не учитываем
                      # небуквенные символы
        # вычисляем количество букв в слове, которое будем шифровать
        for x in range(len(text_list[i])):
            if text_list[i][x].isalpha():
                len_word += 1
        # основной цикл шифрования - проходим по каждому слову
        for j in range(len(text_list[i])):

            # если text_list[i][j] является буквой:
            if text_list[i][j].isalpha():
                # находим место символа text[i][j] в словаре upp_abc
                # либо low_abc
                if text_list[i][j] == text_list[i][j].lower():
                    place = low_abc.index(text_list[i][j])
                if text_list[i][j] == text_list[i][j].upper():
                    place = upp_abc.index(text_list[i][j])
                # находим индекс для измененного символа
                # новый индекс = старый индекс + шаг % длина алфавита
                index = (place + len_word) % alphas

                # записываем шифрованный символ в результирующее слово в
                # зависимости от того, буквы строчные или прописные
                if text_list[i][j] == text_list[i][j].lower():
                    result_text += low_abc[index]
                if text_list[i][j] == text_list[i][j].upper():
                    result_text += upp_abc[index]

            # если text_list[i][j] не является буквой:
            else:
                # добавляем символ к результирующему слову
                result_text += text_list[i][j]

        # если в списке проходим последнее слово, то после него пробел не
        # добавляем, иначе добавляем после слова пробел
        if i == len(text_list) - 1:
            result_text = result_text
        else:
            result_text += ' '

    # выводим зашифрованное (результирующее) слово
    print(result_text)

# вызываем функция шифрования
caesar_shift_word(text)
