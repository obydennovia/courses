print('Задача 2. Посчитай чужую зарплату...')

# Бухгалтер устала постоянно считать вручную среднегодовую зарплату сотрудников компании
# и, чтобы облегчить себе жизнь, обратилась к программисту.
 
# Напишите программу,
# которая принимает от пользователя зарплату сотрудника за каждый из 12 месяцев 
# и выводит на экран среднюю зарплату за год.

salary_year = 0

for salary in range(12):
  salary = int(input("Введите зарплату за месяц: "))
  salary_year += salary
print("Средняя зарплата за год равна", salary_year / 12)