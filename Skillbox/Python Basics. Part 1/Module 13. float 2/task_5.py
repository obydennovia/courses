print('Задача 5. Маятник ')

# Известно, что амплитуда качающегося маятника с каждым разом затухает
# на 8,4% от амплитуды прошлого колебания. 
# Если качнуть маятник,
# то, строго говоря, он не остановится никогда, 
# просто амплитуда будет постоянно уменьшаться до тех пор, 
# пока мы не сочтём такой маятник остановившимся. 
 
# Напишите программу, 
# определяющую, сколько раз качнётся маятник, прежде чем он, по нашему мнению, остановится. 
 
# Программа получает на вход
# начальную амплитуду колебания в сантиметрах 
# и конечную амплитуду его колебаний,
# которая считается остановкой маятника. 

# Обеспечьте контроль ввода.

# Пример:

# Введите начальную амплитуду: 1
# Введите амплитуду остановки: 0.1
 
# Маятник считается остановившимся через 27 колебаний

def pendulum(start, stop):
  count = 0
  while start > stop:
    start = start - (start * 8.4 / 100)
    count += 1
  return count

def input_control(start, stop):
  if (start <= 0) or (stop <=0):
    print("Ошибка ввода. Амплитуда должна быть больше нуля")
    return False
  elif (start < stop):
    print("Ошибка ввода. Начальная должна быть больше амплитуды остановки")
    return False
  else:
    return True

start = float(input("Введите начальную амплитуду: "))
stop = float(input("Введите амплитуду остановки: "))

if input_control(start, stop):
  print("Маятник считается остановившимся через", pendulum(start, stop), "колебаний")