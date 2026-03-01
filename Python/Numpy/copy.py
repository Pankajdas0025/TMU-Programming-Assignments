import numpy as np
a = np.array([1, 2, 3, 4])
b = a.copy()
b[0] = 100
print("Original:", a) #Original: [1 2 3 4]
print("Copy:", b) #Copy: [100   2   3   4]
