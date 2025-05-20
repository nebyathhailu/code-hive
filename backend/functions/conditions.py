def check_if_even(number):
    if number % 2 == 0:
        print(f"{number} is even.")
    else:
        print(f"{number} is not even.")

def check_odd_or_even(number):
    if number % 2 == 0:
        print(f"{number} is even.")
    else:
        print(f"{number} is odd.")


def divisibility_check(n):
    for number in range(n+1):
        if number % 2 == 0:
            print(f"{number} is divisible by 2.")
        elif number % 3 == 0:
            print(f"{number} is divisible by 3.")
        elif number % 5 == 0:
            print(f"{number} is divisible by 5.")
        else:
            print(f"{number} is not divisible by 2, 3,5.")

def countdown(start):
    while start > 0:
        print(start)
        start-=1

def countdown_with_break(start,stop):
    while start > 0:
        print(start)
        if start == stop:
            break
        start-=1

def countdown_with_odd_numbers(start):
    while start > 0:
        if start % 2 == 0:
            start+=1
            continue
        print(start)
        start-=1
        