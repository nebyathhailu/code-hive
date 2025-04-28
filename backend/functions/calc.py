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
        return "Divisor can't be zero"