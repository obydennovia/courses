import random

first_command = [round(random.uniform(5, 10), 2) for i in range(20)]
second_command = [round(random.uniform(5, 10), 2) for i in range(20)]
winners = [(first_command[i] if first_command[i] > second_command[i] else second_command[i]) for i in range(20)]

print("Первая команда:", first_command)
print("\nВторая команда:", second_command)
print("\nПобедители тура:", winners)