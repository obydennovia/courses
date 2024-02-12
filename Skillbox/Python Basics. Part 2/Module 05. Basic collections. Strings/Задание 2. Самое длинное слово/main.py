max_size = 0
max_word = ""

text = input("Введите строку: ")
text = text.split()

for word in text:
    if len(word) > max_size:
        max_size = len(word)
        max_word = word

print(f"Самое длинное слово: '{max_word}'")
print(f"Длина этого слова: {max_size} символ(а)(ов)")