def reverse_number(num):
    rev = 0
    sign = -1 if num < 0 else 1
    num = abs(num)

    while num > 0:
        digit = num % 10
        rev = rev * 10 + digit
        num //= 10

    return sign * rev



n = int(input("Enter a number: "))
print("Reversed Number:", reverse_number(n))