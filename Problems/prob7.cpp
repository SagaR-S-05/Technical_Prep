// Famous celebrity problem
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n=5;
    int arr[n][n]={{0,1,0,1,0},{1,0,1,1,1},{1,1,0,1,},{0,0,0,0,0},{1,1,0,1,0}};
    stack <int> st;
    for(int i=0;i<n;i++)
    {
        st.push(i);
        // cout<<st.top()<<" ";
    }
    while(st.size()>1)
    {
        int first=st.top();st.pop();
        int second=st.top();st.pop();
        if(arr[first][second]==1 && arr[second][first]==0)
        {
            st.push(second);
        }
        else if(arr[first][second]==0 && arr[second][first]==1)
        {
            st.push(first);
        }
        if(st.empty())
        {
            cout<<-1;
        }
        else
        {
            int ans=st.top(),row=0,col=0;
            for(int i=0;i<n;i++)
            {
                row+=arr[ans][i];
                col+=arr[i][ans];
            }
            row==0 && col==n-1 ? cout<<ans:cout<<-1;
            return 0;
        }
    }
}