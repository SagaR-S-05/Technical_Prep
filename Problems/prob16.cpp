// Anagrams
#include<bits/stdc++.h>
using namespace std;

int main()
{
    string s1 = "silent";
    string s2 = "listen";
    int freq[256]={0};
    if(s1.size()!=s2.size())
    {
        exit(0);
    }
    for(int i=0;i<s1.size();i++)
    {
        freq[s1[i]]++;
    }
    for(int i=0;i<s2.size();i++)
    {
        freq[s2[i]]--;
    }
    for(int i=0;i<256;i++)
    {
        if(freq[i]>0)
        {
            cout<<"Invalid";
            exit(0);
        }
    }
    cout<<"Valid";
}