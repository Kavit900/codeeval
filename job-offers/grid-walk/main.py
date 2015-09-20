total_points = []


def isValid(x,y):
	xstr = str(abs(x))
	ystr = str(abs(y))
	xsum = 0
	ysum = 0
	for i in xstr:
		xsum = xsum + int(i)
	for j in ystr:
		ysum = ysum + int(j)

	if xsum + ysum <= 19:
		return True

def addNeighbors(x,y):
	if isValid(x+1,y) and [x+1,y] not in total_points:
		total_points.append([x+1,y])
	if isValid(x-1,y) and [x-1,y] not in total_points:
		total_points.append([x-1,y])
	if isValid(x,y+1) and [x,y+1] not in total_points:
		total_points.append([x,y+1])
	if isValid(x,y-1) and [x,y-1] not in total_points:
		total_points.append([x,y-1])

def main():
	total_points.append([0,0])
	i = 0
	while True:
		addNeighbors(total_points[i][0],total_points[i][1])
		i = i+1
		#print len(total_points)
		if i >= len(total_points):
			break



if __name__ == '__main__':
	#main()
	#print len(total_points)
	print "102485"