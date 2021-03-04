def Union(ids, p, q):
    ids[p -1] = ids[q -1]
    print(ids)

ids = [1, 2, 3, 4, 5]
Union(ids, 1, 5)
Union(ids, 2, 5)
Union(ids, 3, 1)
