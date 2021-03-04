ids = [1, 1, 1, 1, 1]
f = 0
i = 0
while i < len(ids):
    f += ids[i]
    i += 1

ids.insert(0, 2)
print(f)
f += ids[0]
print(f)


