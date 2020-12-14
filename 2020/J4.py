import sys

def main():
    text = str(sys.stdin.readline()).strip()
    string = str(sys.stdin.readline()).strip()
    result = compare(text, string)
    if result == True:
        print("yes")
    else:
        print("no")

def compare(text, string):
    num_of_lett = len(string)
    for x in range(num_of_lett):
        new_str = ""
        for y in range(num_of_lett):
            new_str += string[(x+y) % num_of_lett]
        if new_str in text:
            return True
    return False

main()
