def caesar(text, shift):
  result = ""
  letters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
  for i in text:
    if i in letters:
      result += letters[(letters.index(i) + shift) % len(letters)]
    else:
      result += i
  return result

text = input("Введите сообщение: ")
shift = int(input("Введите сдвиг: "))

print(caesar(text, shift))