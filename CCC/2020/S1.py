import sys

def main():
    n = int(sys.stdin.readline())
    speeds = []
    for x in range(n):
        line = list(map(int, str(sys.stdin.readline()).strip().split()))
        line = tuple(line)
        speeds.append(line)
    speeds.sort()
    result = check_speed(n, speeds);
    print(result)

def check_speed(n, speeds):
    highest = 0
    for x in range(1, n):
        diff = abs((speeds[x][1]-speeds[x-1][1])/(speeds[x][0]-speeds[x-1][0]))
        if diff > highest:
            highest = diff
    return highest

main()
