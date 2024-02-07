word = list(input("Введите слово: "))
new_word = []

for i in range(len(word) - 1, -1, -1):
    new_word.append(word[i])

if word == new_word:
    print("Слово является палиндромом")
else:
    print("Слово не является палиндромом")