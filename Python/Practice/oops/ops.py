class Car:
    def __init__(self, brand='Unknown', year=0): #inbuilt method
        self.brand = brand
        self.year = year
    def greet(self): #class methods
       print("Hello, Brand is ; " + self.brand)

c1 = Car()
c2 = Car('Toyota', 2023)
print(c2.greet())
print(c1.brand, c1.year)
print(c2.brand, c2.year)
"""
Unknown 0
Toyota 2023
"""
