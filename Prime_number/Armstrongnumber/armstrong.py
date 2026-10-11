
num = int(input("Enter a number: "))

order = len(str(num))
total = 0
temp = num

while temp > 0:
    digit = temp % 10
    total += digit ** order
    temp //= 10

if total == num:
    print("Armstrong")
else:
    print("Not Armstrong")
