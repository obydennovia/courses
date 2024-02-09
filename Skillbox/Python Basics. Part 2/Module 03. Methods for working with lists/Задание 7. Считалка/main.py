start_count = 0

num_people = int(input("Количество человек: "))
num_count = int(input("Какое число в считалке? "))

print("Значит, выбывает каждый", num_count, "человек")
people_list = list(range(1, num_people + 1))
while len(people_list) > 1:
    print("\nТекущий круг людей:", people_list)
    print("Начало счёта с номера", people_list[start_count])
    for i in range(num_count - 1):
        start_count += 1
        if start_count == len(people_list):
            start_count = 0
    print("Выбывает человек под номером", people_list[start_count])
    people_list.remove(people_list[start_count])
    if start_count == len(people_list):
        start_count = 0

print("\nОстался человек под номером", people_list[0])