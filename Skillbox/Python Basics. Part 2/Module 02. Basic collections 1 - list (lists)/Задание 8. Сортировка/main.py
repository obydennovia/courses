def selection_sort(nums):
    for i_mn in range(len(nums)):
        for curr in range(i_mn, len(nums)):
            if nums[curr] < nums[i_mn]:
                nums[curr], nums[i_mn] = nums[i_mn], nums[curr]
    return nums


nums = [4, 9, 7, 6, 3, 2]

print(selection_sort(nums))