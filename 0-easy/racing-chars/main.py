import sys

line = open(sys.argv[1], 'r')
lines = []
for x in line:
	x = x.strip()
	lines.append(x)


# Read and store for first lines
checkpoint = lines[0].find('C')
if checkpoint == -1:
	pos = lines[0].find('_')
else:
	pos = checkpoint

temp = list(lines[0])
temp[pos] = '|'
print(''.join(temp))
prev_pos = pos

for i in range(1, len(lines)):
	line = lines[i]
	checkpoint = line.find('C')
	if checkpoint != -1 and abs(checkpoint - prev_pos) <= 1:
		pos = checkpoint
	else:
		pos = line.find('_')

	temp = list(line)
	if pos < prev_pos:
		temp[pos] = '/'
	elif pos == prev_pos:
		temp[pos] = '|'
	else:
		temp[pos] = '\\'
	prev_pos = pos
	print(''.join(temp))