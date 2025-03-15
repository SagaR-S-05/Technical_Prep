#include<bits/stdc++.h>
using namespace std;
int numSquareSum(int n) {
    int num = 0;
    while (n != 0) {
        int digit = n % 10;
        num += digit * digit;
        n /= 10;
    }
    return num;
}


int isHappyNumber(int n)
{
    set<int> st;
    while (1)
    {
        n = numSquareSum(n);
        if (n == 1)
            return true;
        if (st.find(n) != st.end())
            return false;
        st.insert(n);
    }
}

int main()
{
    int num;
    cin>>num;
    int res=isHappyNumber(num);
    if(res==true)
    {
        cout<<"Happy no";
    }
    else
    {
        cout<<"Nope";
    }
}