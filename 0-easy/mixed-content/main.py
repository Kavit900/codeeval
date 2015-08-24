import sys


def main():
	test_cases = open(sys.argv[1], 'r')
	for test in test_cases:
		test = test.strip()
		
		test = test.split(',')
		numbers = []
		words = []
		for i in test:
			if i.isdigit():
				numbers.append(i)
			else:
				words.append(i)
		#print words
		for x in range(0,len(words)):
			#sys.stdout.write(x)
			sys.stdout.write(words[x])
			if x != len(words)-1:
				sys.stdout.write(',')
		sys.stdout.write('|')
		for y in range(0,len(numbers)):
			sys.stdout.write(numbers[y])
			if y != len(numbers)-1:
				sys.stdout.write(',')
		print ""



if __name__ == '__main__':
	main()