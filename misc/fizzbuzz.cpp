/*
Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”
*/

#include <iostream>
#include <string>

using namespace std;

int fizz_buzz(int n);

int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    fizz_buzz(100);
    return 0;
}

// Fizz Buzz Function
int fizz_buzz(int n){
    string output;
    for (int i = 1; i <= n; i++) {
        output = "";
        if (i % 3 == 0) {
            output += "Fizz";
        }
        if (i % 5 == 0) {
            output += "Buzz";
        }
        if (output.compare("") == 0) {
            output = to_string(i);
        }
        cout << output+"\n";
    }
    return 0;
}
