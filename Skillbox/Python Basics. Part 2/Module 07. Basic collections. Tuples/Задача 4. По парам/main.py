from random import randint

number_list = [randint(0, 99) for x in range(1, 11)]
print("Оригинальный список:", number_list)

new_list = [(number_list[i], number_list[i + 1]) for i in range(0, len(number_list), 2)]
print("Новый список:", new_list)
