// Film ticket distribution
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n=5,time=0;
    int arr[n]={1,5,2,3,4};
    int k=2;
    queue <int> q;
    for(int i=0;i<n;i++)
    {
        q.push(i);
    }
    while(arr[k]!=0)
    {
        arr[q.front()]--;
        if(arr[q.front()]==0)
        {
            q.pop();
        }
        else
        {
            q.push(q.front());
            q.pop();
        }
        time++;
    }
    cout<<time;
    
}
    
/*
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;
    int a[n] = {1, 5, 2, 3, 4};
    int k = 2;
    int time = 0;

    for (int i = 0; i < n; i++) {
        if (i <= k) {
            time += min(a[i], a[k]);  
        } else {
            time += min(a[i], a[k] - 1);
        }
    }

    cout << time;
    return 0;
}*/