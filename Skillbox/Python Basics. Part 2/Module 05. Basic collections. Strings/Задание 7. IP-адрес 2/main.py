ip_addr = input("Введите IP: ")

ip_addr = ip_addr.split(".")

if len(ip_addr) != 4:
    print("Адрес - это четыре числа, разделённые точками")
else:
    ip_check = True
    for i in ip_addr:
        if not i.isdigit():
            print(i, "- не целое число")
            ip_check = False
        elif int(i) > 255:
            print(i, "- превышает 255")
            ip_check = False
    if ip_check:
        print("IP-адрес корректен")