/*
A function accepts  parameters: r,unit,and a positive integer array of size n,
where 'r' represents number of rats present in the city, 
'unit' represents amount of the food required for each rat, 
'positive integer array represents' amount of the food present in each house.
Considering all the rats in the city start consuming the food right from the first house,
return number of the houses sufficcient for the rats in terms of the food.
Sample input:
r=7
unit=2
{4,5,1,7,8,2}-> n=6

Sample output:
4
*/
#include<bits/stdc++.h>
using namespace std;
int noofhouses(int arr[],int n, int r, int unit)
{
    int sum=0;
    int i;
    for( i=0;i<n;i++)
    {
        if(arr[i]==r*unit)
        {
            return i;
        }
        else
        {
            sum+=arr[i];
            if(sum>=r*unit)
            {
                break;
            }
        }
    }
    return i+1;
}

int main()

{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    int r;
    cin>>r;
    int unit;
    cin>>unit;
    cout<<noofhouses(arr,n,r,unit);
}