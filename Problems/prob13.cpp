#include <bits/stdc++.h>
using namespace std;

/*int main() {
    string S = "b2c1b1a4c2";
    
    int a[256] = {0};

    for (int i = 0; i < S.size(); i += 2) {
        char ch = S[i];
        int count = S[i + 1] - '0';
        a[ch] += count;
    }

    string result = "";
    for (int i = 0; i < S.size(); i += 2) {
        char ch = S[i];
        if (a[ch] > 0) {
            result += ch;
            result += to_string(a[ch]);
            a[ch] = 0;  
        }
    }

    cout << result << endl;

    return 0;
}
*/
int main()
{
    string S = "b2c1b1a4c2";
    
    int a[256] = {0};
    vector<char> order;  // To remember the order of characters that appear

    int i = 0;
    while (i < S.size()) {
        char ch = S[i];
        int count = 0;
        i++;
        
        // Read the number (it can be more than one digit)
        while (i < S.size() && isdigit(S[i])) {
            count = count * 10 + (S[i] - '0');
            i++;
        }
        
        if (a[ch] == 0) {  // If this character hasn't appeared before, add it to the order
            order.push_back(ch);
        }

        a[ch] += count;  // Add the count to the corresponding character
    }

    string result = "";
    // Iterate through the order vector to ensure characters are printed in the correct order
    for (char ch : order) {
        result += ch;
        result += to_string(a[ch]);
    }

    cout << result << endl;

    return 0;
}