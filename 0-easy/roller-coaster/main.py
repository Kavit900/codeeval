import sys


def main():
	test_cases = open(sys.argv[1], 'r')
	for test in test_cases:
		test = test.strip()
		count = 0;
		result = []
		for i in test:
			if i.isalpha():
				if count%2 == 0:
					result.append(i.upper())
					count = count + 1
				else:
					result.append(i.lower())
					count = count + 1
			else:
				result.append(i)
		print ''.join(result)

if __name__ == '__main__':
	main()