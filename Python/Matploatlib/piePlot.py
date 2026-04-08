import matplotlib.pyplot as plt
sizes = [40, 30, 20, 10]
labels = ['A', 'B', 'C', 'D']
plt.pie(sizes, labels=labels, autopct='%1.1f%%' , colors=['red', 'green', 'blue', 'orange'] , labeldistance=1.1 , explode=[0.1, 0.02, 0.01, 0.2])  # Add explode to highlight the first slice
plt.title('Pie Chart')
plt.legend()  # Add legend to the plot
plt.show()