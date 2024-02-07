old_list = [1, 4, -3, 0, 10]
new_list = [0, 0, 0, 0, 0]

# Если сдвиг больше длины списка, то новый сдвиг будет меньше длины списка или ноль
shift = int(input("Сдвиг: ")) % len(old_list)

for i in range(len(old_list)):
    if (i + shift) <= (len(old_list) - 1):
        new_list[i + shift] = old_list[i]
    else:
        new_list[(i + shift) - len(old_list)] = old_list[i]

print("Изначальный список:", old_list)
print("Сдвинутый список:", new_list)