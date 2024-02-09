def is_polindrome(num_list):
    reverse_list = []
    for i in range(len(num_list) - 1, -1, -1):
        reverse_list.append(num_list[i])
    if num_list == reverse_list:
        return True
    else:
        return False

nums = []
new_nums = []
answer = []

number = int(input("Количество чисел: "))
for i in range(number):
    nums.append(input("Число: "))

for i_nums in range(len(nums)):
    for j_nums in range(i_nums, len(nums)):
        new_nums.append(nums[j_nums])
    if is_polindrome(new_nums):
        for i_answer in range(0, i_nums):
            answer.append(nums[i_answer])
        answer.reverse()
        break
    new_nums = []

print("Последовательность:", nums)
print("Нужно приписать чисел:", len(answer))
print("Сами числа: ", answer)