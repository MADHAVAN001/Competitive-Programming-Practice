using namespace std;
#include<iostream>
#include<stdio.h>
#include<map>
std::map<int,int> mapper;

int recursion(int n)
{
if(n<12)
	return n;
else
	if(mapper[n]>0)
		return mapper[n];
else 
{
int num;
num = recursion(n/2)+recursion(n/3)+recursion(n/4);
mapper[n] = num;
	return num;
}
}

int main()
{
int number;

while(scanf("%d",&number)>0)
{
cin>>number;
int dollars;
dollars = recursion(number);
cout<<dollars<<endl;
}

return 0;
}

