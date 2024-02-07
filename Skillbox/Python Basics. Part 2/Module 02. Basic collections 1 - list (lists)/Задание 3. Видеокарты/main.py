old_list_cards = []
new_list_cards = []

max_series = 0

num = int(input("Количество видеокарт: "))

# Заполняем список серий видеокарт
for i in range(num):
    series = int(input(str(i + 1) + " Видеокарта: "))
    old_list_cards.append(series)

# Находим максимальный номер серии
for i in range(len(old_list_cards) - 1):
    if max_series < old_list_cards[i]:
        max_series = old_list_cards[i]

# Не вносим максимальную серию в новый список
for i in range(len(old_list_cards) - 1):
    if max_series != old_list_cards[i]:
        new_list_cards.append(old_list_cards[i])

print("Старый список видеокарт:", old_list_cards)
print("Новый список видеокарт:", new_list_cards)