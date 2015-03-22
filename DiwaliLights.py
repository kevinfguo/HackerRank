"""
Kevin Guo
HackerRank Solution: Diwali Lights
https://www.hackerrank.com/challenges/diwali-lights
"""
import sys

cases = int(sys.stdin.readline())

for x in xrange(cases):
    pairs = int(sys.stdin.readline())
    pairs = (2**pairs)-1
    pairs = pairs%(10**5)
    print pairs