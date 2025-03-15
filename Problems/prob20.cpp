#include<bits/stdc++.h>
using namespace std;

bool isAnagram(string ch1,string ch2)
{
    int freq[256]={0};
    for(int i=0;i<ch1.size();i++)
    {
        freq[ch1[i]]++;
    }
    for(int i=0;i<ch2.size();i++)
    {
        freq[ch2[i]]--;
    }
    for(int i=0;i<256;i++)
    {
        if(freq[i]!=0)
        {
            return false;
        }
    }
    return true;
    
}
int main()
{
    vector<string> anagramstring={"bat","tab","cat","mat","tam","atb"};
    vector <string> res;
    for(int i=0;i<anagramstring.size();i++)
    {
        
        string s=anagramstring[i];
        for(int j=i+1;j<anagramstring.size();j++)
        {
            if(isAnagram(anagramstring[i],anagramstring[j]))
            {
                res.push_back(anagramstring[j]);
                anagramstring.erase(anagramstring.begin()+j);
            }
            else
            {
                j++;
                
            }
            
        }
        res.push_back(anagramstring[i]);
        
         
        // anagramstring.erase(anagramstring.begin()+i);
    }
    for (auto x: res)
    {
        cout<<x<<" ";
        cout<<endl;
    }
}