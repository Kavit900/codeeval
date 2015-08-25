import sys

def main():
	test_cases = open(sys.argv[1], 'r')
	for test in test_cases:
		test = test.strip()
		words = test.split(" ")
		#print words
		max_length = 0
		final_word = ''
		for i in words:
			ilen = len(i)
			if max_length < ilen:
				max_length = ilen
				final_word = i
		for i in range(0,len(final_word)):
			sys.stdout.write('*'*i)
			sys.stdout.write(final_word[i])
			sys.stdout.write(" ")
		print ""

if __name__ == '__main__':
	main()