/*
1 1 1
7 8 5 9
  6 7 5 (+)
--------
8 5 3 4

Write a function to return number of carries generated while adding numbers.
*/
#include<bits/stdc++.h>
using namespace std;
int noofcarries(int a , int b)
{
    int carry_count=0;
    int carry=0;
    while(a!=0 || b!=0)
    {
        int sum=(a%10)+(b%10) + carry_count;
        if(sum>9 && ((a/10!=0)||(b/10!=0)))
        {
            carry_count++;
            carry=1;
        }
        else
        {
            carry=0;
        }
        a=a/10;
        b=b/10;
    }
    return carry_count;
}

int main()
{
    int a,b;
    cin>>a>>b;
    cout<<noofcarries(a,b);
}