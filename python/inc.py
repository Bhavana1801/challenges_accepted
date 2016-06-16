def inc():
	i=1;
	while True:
		print "i1 ",i
		yield i
		print "i2 ",i
		i+=1
a = inc()
print "**********"
print next(a)
print "**********"
print next(a)
print "**********"
print next(a)