text = input("Введите текст: ")
print("Список гласных букв:", [i for i in text if i in "аеёиоуыэюя"])
print("Длина списка:", len([i for i in text if i in "аеёиоуыэюя"]))