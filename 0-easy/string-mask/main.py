import sys

line = open(sys.argv[1], 'r')
for x in line:
	x = x.strip()
	x = x.split(' ')
	word = x[0]
	binary = x[1]
	word_res = ''
	for t in range(0,len(binary)):
		if binary[t] == '1':
			if word[t].islower():
				word_res = word_res + word[t].upper()
			else:
				word_res = word_res + word[t].lower()
		else:
			word_res = word_res + word[t]
	print word_res