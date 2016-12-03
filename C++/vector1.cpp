using namespace std;
#include<iostream>
#include<stdio.h>
#include<cstdio>
#include<vector>
#include <iostream>
#include <algorithm>
int main()
{
std::vector<int> myvector;

long long n;
cin>>n;
for(long long i = 0;i<n;i++)
{
	int a;
	cin>>a;
	myvector.push_back(a);
}
long long t;
cin>>t;
myvector.erase(myvector.begin()+t-1);
long long a,b;
cin>>a>>b;
myvector.erase(myvector.begin()+a-1,myvector.begin()+b-1);
cout<<myvector.size()<<endl;
for(long long i = 0;i<n-t;i++)
	cout<<myvector.at(i)<<" ";
return 0;
}
