import sys

def main():
	lines = open(sys.argv[1], 'r')
	for x in lines:
		x = x.strip()
		s = x.split(';')
		days = int(s[0])
		array = [int(x) for x in s[1].split(' ')]
		result = 0
		for i in range(0, len(array)-days+1):
			result = max(sum(array[i:i+days]),result)
		print result


if __name__ == '__main__':
	main()