def encode(s):
    result = ""
    count = 1
    for i in range(len(s)):
        if i == len(s) - 1:
            result += s[i] + str(count)
            break
        if s[i] == s[i + 1]:
            count += 1
        else:
            result += s[i] + str(count)
            count = 1
    return result


s = input("Введите строку: ")
print("Закодированная строка:", encode(s))