shop = [['каретка', 1200], ['шатун', 1000], ['седло', 300], ['педаль', 100], ['седло', 1500], ['рама', 12000], ['обод', 2000], ['шатун', 200], ['седло', 2700]]

count = 0
summ = 0

detail = input("Название детали: ")

for i_detail, i_cost in shop:
  if i_detail == detail:
    count, summ = count + 1, summ + i_cost

print("Количество деталей", count)
print("Общая стоимость", summ)