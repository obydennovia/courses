first_string = input("Первая строка: ")
second_string = input("Вторая строка: ")

if len(first_string) != len(second_string):
    print("Первую строку нельзя получить из второй с помощью циклического сдвига")
elif first_string == second_string:
    print("Первая строка получается из второй без сдвига")
else:
    shift = 1
    shift_check = False
    for _ in range(len(first_string)):
        first_string = first_string[-1] + first_string[:-1]
        if first_string == second_string:
            print("Первая строка получается из второй со сдвигом", shift)
            shift_check = True
            break
        else:
            shift += 1
    if not shift_check:
        print("Первую строку нельзя получить из второй с помощью циклического сдвига")