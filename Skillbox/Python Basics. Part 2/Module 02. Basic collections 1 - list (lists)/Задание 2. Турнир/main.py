players = ['Артемий', 'Борис', 'Влад', 'Гоша', 'Дима', 'Евгений', 'Женя', 'Захар']
first_day_list = []

for i in range(len(players) - 1):
    if i % 2 == 0:
        first_day_list.append(players[i])

print("Первый день:", first_day_list)