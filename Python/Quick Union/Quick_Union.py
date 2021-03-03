array = [[1],[2],[3],[4],[5]]

def Connect(num1, num2):
    for x in array:
        if num2 in x:
            x.append(num1)
            break
    print(array)

Connect(1, 5)
Connect(2, 5)
Connect(4, 3)
