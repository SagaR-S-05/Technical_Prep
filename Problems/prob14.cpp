#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s = "aabbcccdddbb";
    int a[256] = {0};
    
    // Count frequency of each character
    for(int i = 0; i < s.size(); i++) {
        a[s[i]]++;
    }

    string first_half = "", second_half = "", middle = "";
    int ans = 0, flag = 0;

    // Construct the longest palindrome
    for(int i = 0; i < 256; i++) {
        if(a[i] % 2 == 0) {
            first_half += string(a[i] / 2, char(i)); // Half of the characters
            second_half = string(a[i] / 2, char(i)) + second_half; // Mirror half of the characters
            ans += a[i]; // Even counts contribute fully to the length
        } else {
            first_half += string((a[i] - 1) / 2, char(i)); // Half of the characters
            second_half = string((a[i] - 1) / 2, char(i)) + second_half; // Mirror half of the characters
            middle = char(i); // Only one character can go in the middle
            ans += a[i] - 1; // Odd counts, we use all except one
            flag = 1;
        }
    }

    // Print the size of the palindrome
    cout << ans + flag << endl;

    // Construct and print the palindrome
    cout << first_half + middle + second_half << endl;
}
