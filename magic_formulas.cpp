using namespace std;

#include<iostream>
#include<stdio.h>

int main()
{
long n;
cin>>n;
long long p, q = 0;
for(int j = 1;j<=n;j++)
{
cin>>p;
long long sum = p;
for(long i = 1;i<=n;i++)
{
sum = sum^(j%i);
}
q =q^sum;
}
cout<<q;
return 0;
}
