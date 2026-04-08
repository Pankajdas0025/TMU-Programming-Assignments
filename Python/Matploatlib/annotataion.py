import matplotlib.pyplot as plt
plt.plot([1,2,3,4], [10,30,20,40])
plt.annotate('Highest Value',
             xy=(4,40),
             xytext=(3,30),
             arrowprops=dict(facecolor='black'))
plt.show()