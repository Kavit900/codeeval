import sys

def usemap(bat, used, d):
    for i in range(max(0, bat-d+1), min(len(used), bat+d)):
        used[i] = True

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    test = test.strip()
    if len(test) == 0:
        continue
    l = int(test.split(' ')[0])
    d = int(test.split(' ')[1])
    n = int(test.split(' ')[2])
    bats = map(int, test.split(' ')[3:])
    used = [False] * (l+1)
    for i in range(0, 6): used[i] = True
    for i in range(len(used)-6, len(used)): used[i] = True
    for bat in bats: usemap(bat, used, d)
    count = 0
    for i in range(0, l):
        if not used[i]:
            count += 1
            usemap(i, used, d)
    print(count)
