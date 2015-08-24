import sys

def remove_repetitions(text):
    if len(text) == 0: return text
    result = [text[0]]
    for char in text[1:]:
        if char != result[-1]:
            result.append(char)
    return ''.join(result)

def main():
    test_cases = open(sys.argv[1], 'r')
    for test in test_cases:
        test = test.strip()
        if len(test) == 0:
            continue
        print(remove_repetitions(test))
    test_cases.close()

if __name__ == '__main__':
    main()


'''import sys
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    # ignore test if it is an empty line
    # 'test' represents the test case, do something with it
    # ...
    # ...
    #test=test.split()
    test = test.strip()
    result=[test[0]]
    #print result
    for char in test[1:]:
        #print char
        if char != result[-1]:
            result.append(char)
    print ''.join(result)
test_cases.close()
'''