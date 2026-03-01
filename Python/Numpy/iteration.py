import numpy as np
arr = np.array([10, 20, 30, 40])
# Iterating with  ---------------------------
for index, value in np.ndenumerate(arr):
    print(index, value)

