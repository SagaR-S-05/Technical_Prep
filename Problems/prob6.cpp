#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n=3;
    int arr[n][n];
    int count=1;
    arr[0][0]=1;
    for(int i=1;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            if(j==0)
            {
                arr[i][j]=arr[i-1][i-1];
            }
            else
            {
                arr[i][j]=arr[i][j-1]+arr[i-1][j-1];
            }
            
        }
        
    }
    cout<<arr[n-1][n-1];
}