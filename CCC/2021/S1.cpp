#include <iostream>
#include <iomanip>
#include <array>

using namespace std;

int sides[10001];

int main(){
    cin.sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    int N;
    int w;
    long double total = 0;

    cin >> N;
    for (int i = 0; i < N+1; i++) {
        cin >> sides[i];
    }
    for (int i = 0; i < N; i++) {
        cin >> w;
        total += (long double)(w*(sides[i]+sides[i+1]))/2;
    }
    cout << fixed << setprecision(5) << total << "\n";
    return 0;
}