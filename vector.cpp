using namespace std;
#include<iostream>
#include<vector>
#include<stdio.h>
#include<algorithm>
#include <cmath>
#include <cstdio>
int main()
{
vector <int> v;
int n;
cin>>n;
for(int i = 0;i<n;i++)
{
int a;
cin>>a;
v.push_back(a);
}
sort(v.begin(),v.end());
for(int i = 0;i<n;i++)
	cout<<v.at(i)<<" ";
return 0;
}
