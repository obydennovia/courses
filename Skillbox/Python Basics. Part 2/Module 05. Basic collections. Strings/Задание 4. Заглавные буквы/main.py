text = input("Введите строку: ")
text = text.split()

for word in text:
    text = word[0].upper() + word[1:]
    print(text, end=" ")