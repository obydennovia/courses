films = ['Крепкий орешек', 'Назад в будущее', 'Таксист',
         'Леон', 'Богемская рапсодия', 'Город грехов',
         'Мементо', 'Отступники', 'Деревня']

def is_film_exist(movie, films_list):
    for i_movie in films_list:
        if i_movie == movie:
            return True
    return False

my_films = []

nums = int(input("Сколько фильмов хотите добавить? "))

for _ in range(nums):
    new_movie = input("Введите название фильма: ")
    if is_film_exist(new_movie, films):
        my_films.append(new_movie)
    else:
        print("Ошибка: фильма '" + new_movie + "' у нас нет :(")

print("Ваш список любимых фильмов:", *my_films)
