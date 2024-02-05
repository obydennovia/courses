print('Задача 5. Наибольшая сумма цифр')

# Вводится N чисел. 
# Среди натуральных чисел, которые были введены, 
# найдите наибольшее по сумме цифр. Выведите на экран это число и сумму его цифр.

max_sum = 0
max_number = 0

number = int(input("Введите количество чисел: "))

for i in range(number):
  num = int(input("Введите число: "))
  sum = 0
  buf = num
  while buf > 0:
    sum += buf % 10
    buf //= 10
  if sum > max_sum:
    max_sum = sum
    max_number = num

print("Число с наибольшей суммой цифр:", max_number)
print("Сумма цифр:", max_sum)