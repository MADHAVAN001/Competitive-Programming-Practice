using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int t;
cin>>t;
while(t--)
{
unsigned long long n1,n2,m;
cin>>n1;
cin>>n2;
cin>>m;
unsigned long long sum = m*(m+1)/2;

if(sum<n1 && sum<n2)
	cout<<(n1-sum)+(n2-sum);
else
	if(n1>n2)
		cout<<n1-n2;
	else
		cout<<n2-n1;
cout<<endl;
}
return 0;
}
