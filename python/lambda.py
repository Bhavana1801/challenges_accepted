def ftn1(x):
	return x**2
def ftn2(x):
	return x**3
def ftn3(x):
	return x**4
callbacks = [ftn1,ftn2,ftn3]
print callbacks
for ftn in callbacks:
	print ftn(2)
callbacks1 = [lambda x:x**2,lambda x:x**3, lambda x:x**4]
for ftn in callbacks1:
	print ftn(2)