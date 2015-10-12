using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
long long num;
cin>>num;
while(num--)
{
long long e,o, sum,k;
cin>>e;
cin>>o;
sum = e+o;
k = sum*2/5;

if(sum%5 == 0 && k-e>0)
	cout<<k-e<<endl;
else
if(sum%5 == 0 && e-k>0)
	cout<<e-k<<endl;
else
	cout<<"-1"<<endl;
}


return 0;
}
