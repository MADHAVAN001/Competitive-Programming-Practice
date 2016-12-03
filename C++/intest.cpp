using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
long long int m,n;
cin>>m>>n;
int num = 0;
while(m--)
{
long long int k;
cin>>k;
if(k%n == 0)
	num++;
}
cout<<num;
return 0;
}
