using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int num_cases;
unsigned long long max;
cin>>num_cases;
while(num_cases--)
{
unsigned long long n, number;
cin>>n;
max = 0;
for(int i = 0;i<n;i++)
{
cin>>number;
if(i == 0)
	max = number;
if(i+number>max)
	{
	max = i+number;
	}
}
cout<<max<<endl;
}
return 0;
}
