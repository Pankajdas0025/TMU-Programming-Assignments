import matplotlib.pyplot as plt
fig, ax = plt.subplots(1, 2)

ax[0].plot([1,2,3], [10,20,15])
ax[1].bar([1,2,3], [5,7,3])

plt.show()