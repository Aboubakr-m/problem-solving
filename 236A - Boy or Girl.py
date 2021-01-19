    s = input()
    count = 0
    for letter in set(s):
        count += 1
    if (count % 2) == 0:
        print("CHAT WITH HER!")
    else:
        print("IGNORE HIM!")
