import random
from statistics import mean
ids = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
print(ids)
while True:
    found = False
    rand = random.randint(0, 7)
    ran5 = random.randint(0, 7)
    print(rand)
    print(ran5)
    if not rand == ran5:
        for x in ids:
            if x == ran5:
                ids[ran5] = rand
                found = True
    if found == False:
        new = mean(ids)
        ids[ran5] = int(new)
    print(ids)
    input()
