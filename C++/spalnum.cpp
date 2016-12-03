using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int t;
cin>>t;
while(t--)
{
int m,n;
cin>>m>>n;
int sum = 0;
for(int i = m;i<=n;i++)
{
int k = i,l = 0;
while(k>=1)
{
int j = k%10;
l = l*10+j;
k = k/10;
}
if(i==l)
	sum+=l;
}
cout<<sum<<endl;
}
return 0;
}

