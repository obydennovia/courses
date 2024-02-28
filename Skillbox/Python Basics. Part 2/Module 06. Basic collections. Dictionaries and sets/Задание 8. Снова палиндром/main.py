def is_palindrome(get_string):
    my_set = set()
    for i in get_string:
        if i in my_set:
            my_set.remove(i)
        else:
            my_set.add(i)
    if len(my_set) > 1:
        return False
    else:
        return True


string = input("Введите строку: ")

if is_palindrome(string):
    print("Можно сделать палиндромом")
else:
    print("Нельзя сделать палиндромом")
