import sys

def count_arrows(x, substring):
	count = 0
	for i in range(0, len(x)-len(substring)+1):
		s = x[i:i+len(substring)]
		if s == substring:
			count = count + 1
	return count


def main():
	lines = open(sys.argv[1], 'r')
	for x in lines:
		x = x.strip()
		print count_arrows(x, '<--<<') + count_arrows(x, '>>-->')

if __name__ == '__main__':
	main()