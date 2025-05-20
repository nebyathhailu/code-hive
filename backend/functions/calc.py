import math
import datetime
def square(number):
    print(number*number)

def add(x,y):
    result = x+y
    return result

def multiply(x,y):
    result = x*y
    return result

def divide(x,y):
    if y != 0:
        result = x/y
        return result
    else:
        return "Divisor can't be zero!"

def subtract(x,y):
    result = x-y
    return result
    
def exponent(base,pow):
    result = base**pow
    return result

def modulus(x,y):
    if y!= 0:
        result = x%y
        return result
    else:
        return "Divider can't be zero"

def is_prime(x):
    if x == 1:
        return ""
    count = 0
    y = range(2,math.ceil(x**0.5)+1)
    for i in y:
        if x % i == 0:
            count = count + 1
    # return count
    if count == 0:
        return True
    else:
        return False

def sum(*numbers):
    print(numbers)
    total = 0
    for number in numbers:
        total += number
    return total