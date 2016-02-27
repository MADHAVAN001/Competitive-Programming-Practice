using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>


int factors(int num)
{
int fact = 1;
for(int i = 1;i<=num/2;i++)
	{
	
	if(num%i == 0)
		fact++;
	}
return fact;
}
int recur(int num)
{
if(num == 1)
	return 1;
else
	{
	float tmp = factors(num);
	return ceil(tmp/2)+recur(num-1);
	}
}


int main()
{
int num;
cin>>num;
cout<<recur(num);
return 0;
}
