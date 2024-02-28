order_dict = dict()

order = int(input("Введите количество заказов: "))

for i in range(order):
    order_list = input(f"Заказ №{i + 1}: ").split()
    if order_list[0] in order_dict:
        if order_list[1] in order_dict[order_list[0]]:
            order_dict[order_list[0]][order_list[1]] += int(order_list[2])
        else:
            order_dict[order_list[0]][order_list[1]] = int(order_list[2])
    else:
        order_dict[order_list[0]] = {order_list[1]: int(order_list[2])}

for i in sorted(order_dict):
    print(f"{i}:")
    for j in sorted(order_dict[i]):
        print(f"{j}: {order_dict[i][j]}")
