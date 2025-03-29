class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        highest, second_highest = float("-inf"), float("-inf")
        for num in nums:
            if num > highest:
                second_highest = highest
                highest = num
            elif num > second_highest:
                second_highest = num
        return (highest - 1) * (second_highest - 1)
