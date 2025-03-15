#include <bits/stdc++.h>
using namespace std;

void permute(string s, int l, int r, set<string> &st) {
    if (l == r) {
        st.insert(s);
        return;
    }
    for (int i = l; i <= r; i++) {
        swap(s[l], s[i]);
        permute(s, l + 1, r, st);
        swap(s[l], s[i]); 
    }
}

int main() {
    string s = "abcd";
    set<string> st;
    permute(s, 0, s.size() - 1, st);

    for (const auto &x : st) {
        cout << x << " ";
    }
    return 0;
}
/*
All possible things:
#include <iostream>
#include <string.h>
using namespace std;

int findSize(char x[]){
    int count=0;
    while(*x!='\0'){
        x++;
        count++;
    }
    return count;
}
void swap(char *x,char *y){
    char temp=*x;
    *x=*y;
    *y=temp;
}
void nextPermutation(char x[], int l, int r, int min,int max){
    if(l==r){
        if(findSize(x)>=min && findSize(x)<=max)
        cout<<x<<endl;
    }else{
        for(int i=l;i<=r;i++){
            swap(&x[l],&x[i]);
            nextPermutation(x,l+1,r,min,max);
            swap(&x[l],&x[i]);
        } 
    }
}
int main(){
    char x[]="abc";
    int minlen=3;
    int maxlen=3;
    nextPermutation(x,0,sizeof(x)-1,minlen,maxlen);    
    return 0;
}
 */