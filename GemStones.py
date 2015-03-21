"""
Kevin Guo
HackerRank Solution: Gem Stones
https://www.hackerrank.com/challenges/gem-stones
"""
import fileinput
import collections
import string


alphabet_set = set(string.ascii_lowercase)
gemcount = collections.Counter()
gems = 0
for line in fileinput.input():
    if fileinput.lineno() == 1:
        gems = int(line)
    else:
        line = line.lower()
        counts = collections.Counter()
        for c in line:
            if c in alphabet_set:
                counts[c] += 1
        for letter in alphabet_set:
            if counts[letter] > 0:
                gemcount[letter] += 1
count = 0
for letter in alphabet_set:
    if gemcount[letter] == gems:
        count += 1
print count