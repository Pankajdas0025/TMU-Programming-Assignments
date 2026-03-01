import numpy as np
a = np.array([1, 2, 3, 4])
b = a.copy()
b[0] = 100
print("Original:", a) #Original: [100   2   3   4]
print("View:", b) #View: [100   2   3   4]
print(b.base)

