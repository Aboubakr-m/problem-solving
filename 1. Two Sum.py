class Solution(object):
    def twoSum(self, nums, target):
        diff = dict()
        for i, num in enumerate(nums):
            if num in diff:
                return [diff[num], i]
            diff[target - num] = i
