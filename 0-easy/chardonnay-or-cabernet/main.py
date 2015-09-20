import sys

def main():
	test_cases = open(sys.argv[1], 'r')
	for test in test_cases:
		test = test.strip()
		s = test.split("|")
		s[0] = s[0].strip()
		s1 = s[0].split(" ")
		s[1] = s[1].strip()
		s2 = list(s[1])
		result = ''
		for i in s1:
			flag = 0
			for j in s2:
				if j not in i:
					flag = 1
					break
			if flag == 0:
				result = result + i
				result = result + " "
		result = result.strip()
		if result == '':
			result = "False"
		print result

if __name__ == '__main__':
	main()