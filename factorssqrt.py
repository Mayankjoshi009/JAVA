from math import sqrt
def factors_sqrt(number):
    factors = []
    for i in range(1, int(sqrt(number)) + 1):
        if number % i == 0:
            factors.append(i)
            if i != number // i:  # avoid adding the square root twice for perfect squares
                factors.append(number // i)
    factors.sort()  # sort the factors for better readability
    print("Factors of", number, "are:", factors)

number = int(input( 8"Enter a number to find its factors: "))
factors_sqrt(number)