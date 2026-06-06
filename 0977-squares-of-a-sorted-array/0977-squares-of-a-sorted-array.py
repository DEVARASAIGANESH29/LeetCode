class Solution(object):
    def sortedSquares(self, nums):
        result = [x ** 2 for x in nums]
        result.sort()
        return result    
        