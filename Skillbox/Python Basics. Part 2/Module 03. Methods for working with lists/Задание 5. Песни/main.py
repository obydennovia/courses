violator_songs = [
  ['World in My Eyes', 4.86],
  ['Sweetest Perfection', 4.43],
  ['Personal Jesus', 4.56],
  ['Halo', 4.9],
  ['Waiting for the Night', 6.07],
  ['Enjoy the Silence', 4.20],
  ['Policy of Truth', 4.76],
  ['Blue Dress', 4.29],
  ['Clean', 5.83]
]

time = 0

count = int(input("Сколько песен выбрать? "))

for i in range(count):
  print("Название", i + 1, "песни: ", end = "")
  song = input()
  for j in range(len(violator_songs)):
    if violator_songs[j][0] == song:
      time += violator_songs[j][1]

print("Общее время звучания песен -", round(time, 2), "минут(ы)")