print('Задача 2. Долги')

# «МирПрогБанк» наконец-то разделил законопослушных граждан и должников и поместил их в разные базы. Но банк не торопится сильно давить на неплательщиков. Операторам банка дали задание позвонить каждому пятому должнику из списка (нумерация начинается с нуля) и уточнить, какую сумму каждый из них задолжал банку.

# Напишите программу, которая получает данные о количестве должников, а затем спрашивает у каждого пятого (начиная с нуля) его долг. В конце выводится общая сумма долгов.

# Пример 1
# Введите количество должников: 13
# Должник с номером 0
# Сколько должны? 1000
# Должник с номером 5
# Сколько должны? 5000
# Должник с номером 10
# Сколько должны? 2000
# Общая сумма долга: 8000

# Пример 2
# Введите количество должников: 10
# Должник с номером 0
# Сколько должны? 1000
# Должник с номером 5
# Сколько должны? 5000
# Общая сумма долга: 6000

count_debt = int(input("Введите количество должников: "))
sum_debt = 0

for debt in range(0, count_debt, 5):
  print("Должник с номером", debt)
  debt_amount = int(input("Сколько должны? "))
  sum_debt += debt_amount

print("Общая сумма долга", sum_debt)