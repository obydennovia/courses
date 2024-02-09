guests = ["Петя", "Ваня", "Саша", "Лиза", "Катя"]

while True:
  print("Сейчас на вечеринке", len(guests), "человек:", guests)
  guest = input("Гость пришёл или ушёл? ")
  if guest == "пришёл":
    name = input("Имя гостя: ")
    if len(guests) < 6:
      guests.append(name)
      print("Привет,", name, "\n")
    else:
      print("Прости,", name, "но мест нет.")
  elif guest == "ушёл":
    name = input("Имя гостя: ")
    guests.remove(name)
    print("Пока,", name, "\n")
  elif guest == "Пора спать":
    print("Вечеринка закончилась, все легли спать.")
    break