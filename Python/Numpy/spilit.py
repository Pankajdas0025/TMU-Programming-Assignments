import numpy as np
arr = np.array([1,2,3,4,5,6])
result = np.array_split(arr, 4)
print(result)
#[array([1, 2]), array([3, 4]), array([5]), array([6])]


