using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
cin>>num;
for(int i = 0;i<num;i++)
{
unsigned long long a, fact = 1;
cin>>a;
for(int i = 1;i<=a;i++)
	fact = fact*i;
cout<<fact<<endl;
}
return 0;
}
