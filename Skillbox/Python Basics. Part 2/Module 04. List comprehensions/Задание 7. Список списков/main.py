nice_list = [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 11, 12], [13, 14, 15], [16, 17, 18]]]
list = [i for j in nice_list for k in j for i in k]

print(list)