import matplotlib.pyplot as plt
import numpy as np
data = np.array([10, 20, 20, 30, 40, 40, 40])
plt.hist(data, bins=6 , color='blue', edgecolor='black' , alpha=0.7 , label='Data Distribution')
plt.title('Histogram')
plt.legend()
plt.show()

