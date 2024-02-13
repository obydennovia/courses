def count_uppercase_lowercase(text):
    uppercase_count = 0
    lowercase_count = 0
    for letter in text:
        if letter.isupper():
            uppercase_count += 1
        elif letter.islower():
            lowercase_count += 1
    return uppercase_count, lowercase_count


text = input("Введите строку для анализа: ")

uppercase, lowercase = count_uppercase_lowercase(text)

print("Количество заглавных букв:", uppercase)
print("Количество строчных букв:", lowercase)