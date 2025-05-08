a=[1,2,3,4,5]
b=[1,2,3]
if all(i in a for i in b):
    print("b is subset of a")
else:
    print("b is not subset of a")