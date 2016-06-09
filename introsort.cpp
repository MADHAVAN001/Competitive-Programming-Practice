using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int v,n,a[1000];
cin>>v;
cin>>n;
for(int i = 0;i<n;i++)
	cin>>a[i];
for(int i = 0;i<n;i++)
	if(a[i]==v)
		cout<<i;
return 0;
}
