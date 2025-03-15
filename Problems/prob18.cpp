#include <bits/stdc++.h>
using namespace std;
int maxperson(vector <int> &entryarr, vector <int> &exitarr)
{
    vector <int> res;
    int ans=0;
    for(int i=0;i<entryarr.size();i++)
    {
        ans+=entryarr[i]-exitarr[i];
        res.push_back(ans);
    }
    int max_person=*max_element(res.begin(),res.end());
    return max_person;
}
int main()
{
    vector <int> entryarr={2,5,0,6,4};
    vector <int> exitarr = {1,0,2,5,2};
    cout<<maxperson(entryarr,exitarr);
}
