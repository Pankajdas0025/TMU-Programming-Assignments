import matplotlib.pyplot as plt
x = [1,2,3,4]
y = [10,20,15,25]

plt.plot(x, y)
plt.title('Sales Report')
plt.savefig('sales_report.png', dpi=300)
plt.show()