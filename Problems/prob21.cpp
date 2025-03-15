#include <bits/stdc++.h>
using namespace std;

void permute(string s, int l, int r, set<string> &st) {
    if (l == r) {
        st.insert(s);
        return;
    }
    for (int i = l; i <= r; i++) {
        swap(s[l], s[i]);
        permute(s, l + 1, r, st);
        swap(s[l], s[i]); 
    }
}

int main() {
    string s = "abcd";
    set<string> st;
    permute(s, 0, s.size() - 1, st);

    for (const auto &x : st) {
        cout << x << " ";
    }
    return 0;
}
