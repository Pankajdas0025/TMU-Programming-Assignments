import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt
data = np.random.rand(3,3)
sns.heatmap(data, annot=True)
sns.set_style("white")

plt.show()
