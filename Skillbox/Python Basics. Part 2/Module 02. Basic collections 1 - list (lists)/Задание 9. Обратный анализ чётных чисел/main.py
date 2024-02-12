def selection_sort(nums):
    for i_mn in range(len(nums)):
        for curr in range(i_mn, len(nums)):
            if nums[curr] > nums[i_mn]:
                nums[curr], nums[i_mn] = nums[i_mn], nums[curr]
    return nums


numbers_list = [7, 14, 3, 18, 21, 10, 9, 6]

selection_sort(numbers_list)

for i in range(len(numbers_list) - 1):
    if numbers_list[i] % 2 == 0:
        print(numbers_list[i], end=' ')