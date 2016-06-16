global x
x = 1
def exx():
	print "x ",x
	y = 2
	print "y ",y
	global z;
	z = 3
	print "z ", z
exx()
def exx2():
	print "second"
	global z;
	z = 10
	global x 
	x = 100
	print "z ",z
	print "x ",x
exx2()
print "first"
exx()