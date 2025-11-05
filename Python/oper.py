a= 5
b = 2
print (a+b)
print (a*b)
print (a/b)
print (a-b)
print(a%b)

# x = '0.5'
# print(2 * x)
#** operator used for power
print(a**b)
#// operator remove decimal values
print(a//b)

#operator precedence
x = 5
y = 10
z = 15
result = x + y * z
print(result)  # Output will be 155 because * has higher precedence than +

#combined assignment operators
x = 5
x += 3   # x = x + 3
print(x)  # Output: 8

#comparison operators
a = 10
b = 20
print(a == b)  # False
print(a != b)  # True

#logical operators
p = True
q = False
print(p and q)  # False
print(p or q)   # True
print(not p)    # False

#bitwise operators
m = 5  # in binary: 0101
n = 3  # in binary: 0011
print(m & n)  # Bitwise AND: 0001 (1 in decimal)
print(m | n)  # Bitwise OR: 0111 (7 in decimal)