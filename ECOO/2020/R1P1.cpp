#include <iostream>
#include <array>

using namespace std;


int main() {
    string notes[] = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    int mimi[4];
    int semi[3];
    cin.sync_with_stdio(0);
    cin.tie(0);

    int t;
    int note;
    string input;
    
    cin >> t;
    
    for (int i = 0; i < t; i++) {
        for (int m = 0; m < 4; m++) {
            cin >> input;
            for (int val = 0; val < int(sizeof(notes)); val++) {
                if (input == notes[val]) {
                    mimi[m] = val;
                    break;
                }
            }
        }
        for (int m = 0; m < 3; m++) {
            note = mimi[m+1] - mimi[m];
            if (note < 0) {
                note = 12 - mimi[m] + mimi[m+1];
            }
            semi[m] = note;
        }
        if (semi[0] == 4 && semi[1] == 3 && semi[2] == 3) {
            printf("root\n");
        }
        else if (semi[0] == 3 && semi[1] == 3 && semi[2] == 2) {
            printf("first\n");
        }
        else if (semi[0] == 3 && semi[1] == 2 && semi[2] == 4) {
            printf("second\n");
        }
        else if (semi[0] == 2 && semi[1] == 4 && semi[2] == 3) {
            printf("third\n");
        }
        else { 
            printf("invalid\n");
        }
        
    }
    return 0;
}
