pairs = int(input("Введите количество пар слов: "))

synonyms = dict()

for i in range(pairs):
    print(f"Пара {i + 1}: ", end="")
    first_word, second_word = input().lower().split(" - ")
    synonyms[first_word] = second_word
    synonyms[second_word] = first_word

while True:
    word = input("\nВведите слово: ").lower()
    if word in synonyms:
        print("Синоним:", synonyms[word])
        break
    else:
        print("Такого слова в словаре нет")
