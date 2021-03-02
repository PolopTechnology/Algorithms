import random
ids = {
    0:0,
    1:1,
    2:2,
    3:3,
    4:4,
    5:5,
    6:6,
    7:7,
    8:8,
    9:9
    }

while True:
    broken = False
    rand = random.randint(0, 9)
    ran5 = random.randint(0, 9)
    for x, y in ids.items():
        if x == ran5:
            for a, b in ids.items():
                if a == rand and a == b:
                    ids[a] = y
                    broken = True
                    break
                if a == rand and not a == b:
                    ids[x] = b
                    broken = True
                    break
        if broken == True:
            break
    print(ids)
    input()
                    
