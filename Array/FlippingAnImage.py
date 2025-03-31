class Solution(object):
    def flipAndInvertImage(self, image):
        """
        :type image: List[List[int]]
        :rtype: List[List[int]]
        """
        n = len(image) - 1
        for i in range(len(image)):
            for j in range(len(image[i])//2):
                temp = image[i][j]
                image[i][j] = image[i][n-j]
                image[i][n-j] = temp
        for i in range(len(image)):
            for j in range(len(image[i])):
                image[i][j] ^= 1
                    
        return image
        
