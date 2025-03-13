
#include<bits/stdc++.h>
using namespace std;
int main()
{
   char name[]="sachin";
   char vowels[]="aeiouAEIOU";
   int nameLen=strlen(name);
   int vowelsLen=strlen(vowels);
   int ch;
   for(int i=0;i<nameLen;i++)
   {
       ch=name[i];
       for(int j=0;j<vowelsLen;j++)
       {
           if(ch==vowels[j])
           {
               name[i]=name[i]+2;
           }
       }
   }
   cout<<name; //Scchkn
   
}
/*
#include<bits/stdc++.h>
using namespace std;

int isVowel(char ch)
{
    string str = "aeiouAEIOU";
    return (str.find(ch) != string::npos);
}

int main()
{
    string a= "sachin";
    for(int i=0 ; i < a.size() ; i++){
        if(isVowel(a[i])){
            a[i] = a[i]+2;
        }
    }
    cout << a;
}
*/