/*
Consider 5 football players with jersey numbers 10,20,30,40,50.
They are sitting in a circle, where the seat numbers corresopinding to jersey numbers are:
10-> Seat 1
20 -> Seat 2
30 -> Seat 3
40 -> Seat 4
50 -> Seat 5

Seat numbers are constant.
Now, footbal players shift their seats two positions to the RHS.
Return the seat number of a given jersey number.

*/

#include<bits/stdc++.h>
using namespace std;

int seatno(vector<int>& jerseys, int jersey_number) {
    int n = jerseys.size();
    
    // Find the index of the jersey number in the original array
    int original_index = -1;
    for (int i = 0; i < n; i++) {
        if (jerseys[i] == jersey_number) {
            original_index = i;
            break;
        }
    }

    // If the jersey number is not found, return -1 (invalid input)
    if (original_index == -1) {
        return -1;
    }

    // Apply the right shift by 2 positions
    int new_index = (original_index + 2) % n;

    // Return the new seat number, which is 1-based
    return new_index + 1;
}

int main() {
    int n = 5;
    vector<int> jerseys = {10, 20, 30, 40, 50};

    int jersey_number = 20;
    cout << seatno(jerseys, jersey_number);  // Output the seat number for the given jersey number
}

/* Other way around:
#include<bits/stdc++.h>
using namespace std;

int seatno(vector <int> &jerseys, int jerseyno)
{
    
    int shift1=(seat+1)%jerseys.size();
    int ans=(shift1+1)%jerseys.size();
    return jerseys[ans];
    
}

int main()
{
    int n=5;
    vector <int> jerseys={10,20,30,40,50};
    
    int jerseyno=10;
    cout<<seatno(jerseys,jerseyno);
}
*/