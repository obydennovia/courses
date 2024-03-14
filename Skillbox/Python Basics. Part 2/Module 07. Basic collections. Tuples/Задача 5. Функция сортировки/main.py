def tpl_sort(tpl):
    is_float = False
    for i in tpl:
        if not isinstance(i, int):
            is_float = True
            break
    if is_float:
        return tpl
    else:
        return tuple(sorted(tpl))


tpl_1 = (6, 3, -1, 8, 4, 10, -5)
print("Исходный список", tpl_1)
print("Итоговый список", tpl_sort(tpl_1))

print()

tpl_2 = (6.0, 3, -1, 8, 4, 10, -5)
print("Исходный список", tpl_2)
print("Итоговый список", tpl_sort(tpl_2))
