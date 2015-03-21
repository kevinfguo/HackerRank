"""
Kevin Guo
HackerRank Solution: Pangrams
https://www.hackerrank.com/challenges/pangrams
"""

import fileinput
import collections
import string

alphabet_set = set(string.ascii_lowercase)
for line in fileinput.input():
    line = line.lower()
    pan = True
    counts = collections.Counter()
    for c in line:
        if c in alphabet_set:
            counts[c] += 1
    for letter in alphabet_set:
        if counts[letter] == 0:
            pan = False
            break
    if pan == True:
        print 'pangram'
    else:
        print 'not pangram'