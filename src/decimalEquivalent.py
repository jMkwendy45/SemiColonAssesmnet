import math


def divide_number(number):
    divided = 1
    divisor = 1
    for index in range(1, int(math.log10(number) + 1)):
        divided = number // divisor % 10
        divisor *= 10
    return divided


def multiply_by_two(number):
    counter = 1
    sum_ = 0
    for i in range(1, int(math.log10(number)) + 1):
        multiply = divide_number(number) * counter
        counter *= 2
        sum_ += multiply
    return sum_


number = int(input("Enter a binary integer, that has 0's and 1's: "))
print(multiply_by_two(number))