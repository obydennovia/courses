list_numbers = []

number = int(input("Введите число больше нуля: "))

if number <= 0:
    print("Неверный ввод. Число должно быть больше нуля!")
else:
    for i in range(1, number + 1):
        if i % 2 != 0:
            list_numbers.append(i)
    print("Список из нечётных чисел от одного до N:", list_numbers)