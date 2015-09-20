import sys

def isprime(n):
   """Returns True if n is prime"""
   if n == 2: return True
   if n == 3: return True
   if n % 2 == 0: return False
   if n % 3 == 0: return False

   i = 5
   w = 2
   while i * i <= n:
      if n % i == 0:
         return False

      i += w
      w = 6 - w

   return True


line = open(sys.argv[1], 'r')
for x in line:
    x = x.strip()
    x = x.split(',')
    n1 = int(x[0])
    n2 = int(x[1])
    i = n1
    count = 0
    while(i <= n2):
      if(isprime(i)):
         count = count+1
      i = i+1
    print count


