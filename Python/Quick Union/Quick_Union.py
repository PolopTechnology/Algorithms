array = [[1],[2],[3],[4],[5]]

def Connect(num1, num2):
    for x in array:
        if num2 in x:
            x.append(num1)
            for y in array:
                if num1 in y:
                    y.remove(num1)
                    break
    print(array)

while True:
    q = int(input())
    p = int(input())
    Connect(q, p)
