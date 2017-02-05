def missing(roll):
    
    roll_set = set() 
    
    for num in roll:
        if (num in roll_set):
            roll_set.remove(num)
        else:
            roll_set.add(num)
    
    return roll_set
 
test = int(raw_input())
 
for i in range(test):
    
    n = int(raw_input())
    
    roll = list(map(int, raw_input().split()))
    
    missing_roll = missing(roll)
    print(missing_roll.pop()) 