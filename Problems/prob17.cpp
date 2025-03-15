#include <bits/stdc++.h>
using namespace std;

int rem_monkeys(int no_mon,int banana,int peanuts,int max_ban,int max_nuts)
{
    char op;
    
    while(banana>=2 || peanuts>=3)
    {
        cout<<"Banana or Peanuts? 1 for ban, 2 for nuts:"<<endl;
        cin>>op;
        switch(op)
        {
            case '1':
            banana-=max_ban;
            no_mon--;
            break;
            
            case '2':
            peanuts-=max_nuts;
            no_mon--;
            break;
        }
    }
    return no_mon;
}
int main()
{
   int no_mon=20;
   int banana=12;
   int peanuts=13;
   int max_ban=2;
   int max_nuts=3;
   cout<<rem_monkeys(no_mon,banana,peanuts,max_ban,max_nuts);
}