import sys

line = open(sys.argv[1], 'r')
for x in line:
    x = x.strip()
    if len(x) == 0:
        continue
    x = x.split(' ')
    binary_string = ''
    for i in range(0, len(x), 2):
        #print i
        code = x[i]
        seq = x[i+1]
        #print len(test)
        if code == '0':
            binary_string += seq
        else:
            binary_string += '1' * len(seq)
            #print seq
            #print binary_string
    print(int(binary_string, 2))
