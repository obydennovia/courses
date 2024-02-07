def check_weight(weight):
    if weight < 1 or weight > 200:
        print("Неверный ввод!")
        return False
    return True

container = []

nums = int(input("Количество контейнеров: "))
result = True

while result:
    for i in range(nums):
        weight = int(input("Введите вес контейнера: "))
        if check_weight(weight):
            container.append(weight)
    result = False

new_weight = int(input("Введите вес нового контейнера: "))

# Найти элемент списка, перед которым вставить новое значение
if check_weight(new_weight):
    weight_index = 0
    for i in range(len(container) - 1):
        if new_weight <= container[i]:
            weight_index = i + 1 # вставить новый контейнер после текущего индекса
    print("\nНомер, который получит новый контейнер:", weight_index + 1)