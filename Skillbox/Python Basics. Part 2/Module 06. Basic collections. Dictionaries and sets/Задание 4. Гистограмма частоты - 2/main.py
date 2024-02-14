def inverted_dict(input_dict):
    inverse_dict = dict()
    for key in input_dict:
        value = input_dict[key]
        if value not in inverse_dict:
            inverse_dict[value] = [key]
        else:
            inverse_dict[value].append(key)
    return inverse_dict


text = input("Введите текст: ")

text_dict = {}
for i in text:
    if i in text_dict:
        text_dict[i] += 1
    else:
        text_dict[i] = 1

inverted_dict = inverted_dict(text_dict)

print("Оригинальный словарь частот: ")
for i_key in sorted(text_dict):
    print(i_key, ":", text_dict[i_key])

print("\nИнвертированный словарь частот: ")
for i_key in sorted(inverted_dict):
    print(i_key, ":", inverted_dict[i_key])
