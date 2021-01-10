#include <iostream>
#include <array>

using namespace std;

int team_score (int three_p, int two_p, int one_p) {
    return three_p * 3 + two_p * 2 + one_p;
}

int arr[6];

int main() {
    cin.sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    for (int i = 0; i < 6; i++) {
        cin >> arr[i];
    }

    if (team_score(arr[0],arr[1], arr[2]) > team_score(arr[3], arr[4], arr[5])) {
        cout << 'A';
    }
    else if (team_score(arr[0],arr[1], arr[2]) < team_score(arr[3], arr[4], arr[5])) {
        cout << 'B';
    }
    else {
        cout << 'T';
    }
    return 0;
}
