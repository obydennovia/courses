text = input("Введите строку: ")

first_h, last_h = 0, 0

for i in range(len(text)):
    if text.index("h"):
        first_h = text.index("h")
        break
    if text.rindex("h"):
        last_h = text.rindex("h")
        break

print(first_h, last_h)

print("Развёрнутая последовательность между первым и последним h:", text[last_h - 1:first_h:-1])