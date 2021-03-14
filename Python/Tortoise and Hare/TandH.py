Tortoise = 0
Hare = 0
while True:
    Tortoise += 1
    Hare += 2
    if Tortoise == Hare:
        print(Tortoise)
        print(Hare)
        break

    if Tortoise == 10:
        Tortoise = 0
    if Hare >= 10:
        Hare = 0
