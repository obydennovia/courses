suffix = ("@", "№", "$", "%", "^", "&", "*", "(", ")")
postfix = ("txt", "docx")

file_name = input("Название файла: ")

if file_name.startswith(suffix):
    print("Ошибка: название начинается недопустимым символом.")
elif not file_name.endswith(postfix):
    print("Ошибка: неверное расширение файла. Ожидалось .txt или .docx.")
else:
    print("Файл назван верно.")