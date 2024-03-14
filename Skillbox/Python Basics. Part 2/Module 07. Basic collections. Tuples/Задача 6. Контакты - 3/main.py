# TODO здесь писать код
def find_by_surname(phonebook, surname):
    for i_name, i_surname in phonebook:
        if i_surname.lower() == surname.lower():
            return [i_name, i_surname, phonebook[(i_name, i_surname)]]


def is_contact(phonebook, contact, phone):
    result = False
    for i_name, i_surname in phonebook:
        i_phone = str(phonebook[i_name, i_surname])
        if [i_name, i_surname] == contact and i_phone == phone:
            result = True
    return result


phonebook = {
    ('Ivan', 'Ivanov'): 111,
    ('Petr', 'Petrov'): 222,
    ('Egor', 'Egorov'): 333,
}

while True:
    print("Введите номер действия:")
    print("1. Добавить контакт")
    print("2. Найти человека")
    print("3. Выход")

    n = int(input())
    if n == 1:
        contact = input("Введите имя и фамилию нового контакта (через пробел): ").split()
        phone = input("Введите номер телефона: ")
        if is_contact(phonebook, contact, phone):
            print("Такой человек уже есть в контактах\n")
        else:
            phonebook[(contact[0], contact[1])] = phone
            print("Текущий словарь контактов:")
            print(phonebook, "\n")
    elif n == 2:
        surname = input("Введите фамилию для поиска: ")
        if find_by_surname(phonebook, surname):
            print(*find_by_surname(phonebook, surname), "\n")
        else:
            print("Контакт не найден\n")
    elif n == 3:
        break
