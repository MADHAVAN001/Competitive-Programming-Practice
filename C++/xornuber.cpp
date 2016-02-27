using namespace std;
#include<iostream>
#include<stdio.h>

long bitXor(long x, long y) 
{
    int a = x & y;
    int b = ~x & ~y;
    int z = ~a & ~b;
    return z;
}     

int main()
{
int t;
cin>>t;
while(t--)
{
unsigned long long n,k,h;
cin>>n;
int tmp = 0;
for(int i = 0;i<n/2+1;i++)
{
k = bitXor(i,i+1);

if(k == n)
	{
	h = i;
	tmp = 1; 
	break;
	}
}
if(tmp == 1)
	cout<<h<<endl;
else
	cout<<"-1"<<endl;
}

return 0;
}
