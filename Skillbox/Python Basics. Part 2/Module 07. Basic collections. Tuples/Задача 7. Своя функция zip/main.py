def short_range(string, tpl):
    return min(len(string), len(tpl))


src_str = "abcdefg"
num_tpl = (10, 20, 30, 40)

complete_tuple = ((src_str[item], num_tpl[item]) for item in range(short_range(src_str, num_tpl)))

print("Строка:", src_str)
print("Кортеж чисел:", num_tpl)

print("Результат:")
print(complete_tuple)
for item in complete_tuple:
    print(item)
