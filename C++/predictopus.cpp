using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
double p, value;
cin>>num;
while(num--)
{
cin>>p;
if(p>0.5)
	value = 10000+(1-p) *10000*(2*p-1);
else
	value = 10000+10000*p*(1-2*p);
printf("%0.6lf\n",value);
}
return 0;
}
