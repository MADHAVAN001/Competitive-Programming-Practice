using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int t;
cin>>t;
while(t--)
{
int m,n,p,q;
cin>>m>>n;
p = m;
q = n;
while(n)
{
m = m%n;
m ^= n ^= m ^= n;
}
cout<<m<<" "<<(p*q)/m<<endl;
}
return 0;
}
