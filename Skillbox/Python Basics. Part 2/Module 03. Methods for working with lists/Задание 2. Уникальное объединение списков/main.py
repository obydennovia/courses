def merge_sorted_lists(list1, list2):
    merged = []
    merged.extend(list1)
    for i in list2:
        if i not in merged:
            merged.append(i)
    return selection_sort(merged)


def selection_sort(nums):
    for i_mn in range(len(nums)):
        for curr in range(i_mn, len(nums)):
            if nums[curr] < nums[i_mn]:
                nums[curr], nums[i_mn] = nums[i_mn], nums[curr]
    return nums


list1 = [1, 3, 5, 7, 9]
list2 = [2, 4, 5, 6, 8, 10]

merged = merge_sorted_lists(list1, list2)
print(merged)