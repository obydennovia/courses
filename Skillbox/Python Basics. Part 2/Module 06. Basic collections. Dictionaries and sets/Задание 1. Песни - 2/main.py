violator_songs = {
    'World in My Eyes': 4.86,
    'Sweetest Perfection': 4.43,
    'Personal Jesus': 4.56,
    'Halo': 4.9,
    'Waiting for the Night': 6.07,
    'Enjoy the Silence': 4.20,
    'Policy of Truth': 4.76,
    'Blue Dress': 4.29,
    'Clean': 5.83
}

time = 0

song_num = int(input("Сколько песен выбрать? "))

for i_song in range(song_num):
    song_name = input(f"Название {i_song + 1} песни: ")
    if violator_songs[song_name]:
        time += violator_songs[song_name]

print(f"Общее время звучания песен: {round(time, 2)} минут(ы)")