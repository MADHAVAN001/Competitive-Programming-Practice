using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
cin>>num;
long long x,y,sum, n,d,a;
while(num--)
{
cin>>x;
cin>>y;
cin>>sum;
n = 2*sum/(x+y);
d = (y-x)/(n-5);
a = x - 2*d;
cout<<n<<endl;
for(int i = 0;i<n;i++)
{
cout<<a+i*d<<" ";
}
cout<<endl;
}
return 0;
}
