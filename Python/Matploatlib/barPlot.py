import matplotlib.pyplot as plt
categories = ['A', 'B', 'C']
values = [5, 7, 3]

plt.bar(categories, values , color=['red', 'green', 'blue'], width=0.15 , label='Values')
plt.xlabel('Categories')
plt.ylabel('Values')
plt.title('Bar Chart')
plt.legend()
plt.show()