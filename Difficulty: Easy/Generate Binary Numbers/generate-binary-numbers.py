class Solution:
    def generateBinary(self, n):
        return [bin(x).replace('0b', '') for x in range(1, n + 1)]
        