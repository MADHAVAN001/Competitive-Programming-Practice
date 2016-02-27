using namespace std;
#include<iostream>
#include<stdio.h>
#include<cmath>
int main()
{
int num;
cin>>num;
for(int i = 0;i<num;i++)
{
int m,n;
int count = 0;
cin>>m;
cin>>n;
if(m==n)
{
	cout<<count<<endl;
	continue;
}
int tmp = m;
while(log2(tmp)-(int)log2(tmp) > 0.001 || n<tmp)
{
if(tmp%2==0)
{
	tmp = tmp/2;
}
else
{
tmp = (tmp-1)/2;
}

count++;
}
if(tmp == 1)
	{
	count += (int)(log2(n));
	}
else
	count += (int)(log2(n)-log2(tmp));
cout<<count<<endl;
}

return 0;
}
