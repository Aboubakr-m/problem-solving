class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        diff = dict()
        for i, num in enumerate(nums):
            if num in diff:
                return [diff[num], i]
            diff[target - num] = i
