def password_length(password):
    if len(password) >= 8:
        return True
    else:
        return False


def password_digit(password):
    count = 0
    for symbol in password:
        if symbol.isdigit():
            count += 1
    if count >= 3:
        return True
    else:
        return False


def password_upper_letters(password):
    for symbol in password:
        if symbol.isupper():
            return True
    return False


def password_check(password):
    if password_length(password) and password_upper_letters(password) and password_upper_letters(password):
        print("Это надёжный пароль.")
        return True
    else:
        print("Пароль ненадёжный. Попробуйте ещё раз.")
        return False


while True:
    password = input("Придумайте пароль: ")
    if password_check(password):
        break