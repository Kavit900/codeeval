import sys


def main():
	test_cases = open(sys.argv[1], 'r')
	for test in test_cases:
		test = test.strip()
		matrix = [[0 for i in xrange(8)] for i in xrange(8)]
		entry = list(test)
		#print entry
		col = int(ord(entry[0])-ord('a'))
		row = int(entry[1])
		#print row, col
		possible_moves = []
		if(row+2 >= 1 and row+2 < 8 and col+1 >= 1 and col+1 < 8):
			x = str(chr(col+1+97))+str(row+2)
			possible_moves.append(x)
		if(row+2 >= 1 and row+2 < 8 and col-1 >= 1 and col-1 < 8):
			x = str(chr(col-1+97))+str(row+2)
			possible_moves.append(x)
		if(row-2 >= 1 and row-2 < 8 and col-1 >= 1 and col-1 < 8):
			x = str(chr(col-1+97))+str(row-2)
			possible_moves.append(x)
		if(row-2 >= 1 and row-2 < 8 and col+1 >= 1 and col+1 < 8):
			x = str(chr(col+1+97))+str(row-2)
			possible_moves.append(x)
		if(row+1 >= 1 and row+1 < 8 and col+2 >= 1 and col+2 < 8):
			x = str(chr(col+2+97))+str(row+1)
			possible_moves.append(x)
		if(row-1 >= 1 and row-1 < 8 and col+2 >= 1 and col+2 < 8):
			x = str(chr(col+2+97))+str(row-1)
			possible_moves.append(x)
		if(row+1 >= 1 and row+1 < 8 and col-2 >= 1 and col-2 < 8):
			x = str(chr(col-2+97))+str(row+1)
			possible_moves.append(x)
		if(row-1 >= 1 and row-1 < 8 and col-2 >= 1 and col-2 < 8):
			x = str(chr(col-2+97))+str(row-1)
			possible_moves.append(x)
		print sorted(possible_moves)

if __name__ == '__main__':
	main()