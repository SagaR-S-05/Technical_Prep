// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Write C++ code here
    string exp="4*5-2/4";
    int ans=exp[0]-'0';
    for(int i=1;i<exp.size();i+=2)
    {
        if(exp[i]=='*')
        {
            ans=ans*(exp[i+1]-'0');
        }
        else if(exp[i]=='-')
        {
            ans=ans-(exp[i+1]-'0');
        }
        else if(exp[i]=='/')
        {
            ans=ans/(exp[i+1]-'0');
        }
    }
    cout<<ans;

    return 0;
}