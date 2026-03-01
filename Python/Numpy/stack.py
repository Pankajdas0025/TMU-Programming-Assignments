import numpy as np
a = np.array([1,2,3]) #ndim = 1
b = np.array([4,5,6]) #ndim = 1
result = np.stack((a, b))
print(result)
print(result.ndim) #ndim = 2
