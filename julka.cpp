using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int num;
unsigned long long x,y, sum, diff;

cin>>num;
for(int i = 0;i<num;i++)
{
cin>>sum;
cin>>diff;
x = (sum+diff)/2;
y = sum-x;
cout<<x<<endl;
cout<<y<<endl;
}


return 0;
}
