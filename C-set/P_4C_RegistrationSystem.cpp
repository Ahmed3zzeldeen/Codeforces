#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main() {
    int n; cin>>n;
    map<string , int> mp;
    for (int i=0; i < n; i++){
        string txt ; cin>> txt;
        if (mp.count(txt) == 0){ 
            mp[txt] = 1 ;
            cout<<"OK\n";
        } else {
            cout<<txt<<mp[txt]<<endl;
            mp[txt]++;
        }
    }
    return 0;
}