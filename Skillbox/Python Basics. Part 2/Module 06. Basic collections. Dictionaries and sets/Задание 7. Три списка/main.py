def common_elements(array_1, array_2, array_3):
    result = []
    for i in array_1:
        if (i in array_2) and (i in array_3):
            result.append(i)
    return result


def not_common_elements(array_1, array_2, array_3):
    result = []
    for i in array_1:
        if (i not in array_2) and (i not in array_3):
            result.append(i)
    return result


def sets_common_elements(array_1, array_2, array_3):
    set_1 = set(array_1)
    set_2 = set(array_2)
    set_3 = set(array_3)
    return sorted(set_1.intersection(set_2, set_3))


def sets_not_common_elements(array_1, array_2, array_3):
    set_1 = set(array_1)
    set_2 = set(array_2)
    set_3 = set(array_3)
    return sorted(set_1.difference(set_2, set_3))


array_1 = [1, 5, 10, 20, 40, 80, 100]
array_2 = [6, 7, 20, 80, 100]
array_3 = [3, 4, 15, 20, 30, 70, 80, 120]

print("Задача 1: ")
print("Решение без множеств:", *common_elements(array_1, array_2, array_3))
print("Решение с множествами:", *sets_common_elements(array_1, array_2, array_3))

print("Задача 2: ")
print("Решение без множеств:", *not_common_elements(array_1, array_2, array_3))
print("Решение с множествами:", *sets_not_common_elements(array_1, array_2, array_3))
