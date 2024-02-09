size_rollers = []
size_foot = []

count_clients = 0

num_rollers = int(input("Количество роликов: "))

for i in range(num_rollers):
  print("Размер", i + 1, "пары: ", end = "")
  size = input()
  size_rollers.append(int(size))

num_people = int(input("\nКоличество людей: "))

for i in range(num_people):
  print("Размер ноги", i + 1, "человека: ", end = "")
  size = input()
  size_foot.append(int(size))

for i in range(num_people):
  for j in range(num_rollers):
    if size_foot[i] == size_rollers[j]:
      count_clients += 1
      size_rollers[j] = -1
      break

print("Наибольшее количество людей, которые могут взять ролики: ", count_clients)