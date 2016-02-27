using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
int main()
{
int num;
cin>>num;


for(int k = 0;k<num;k++)
{
int m,n,i;
cin>>m;
cin>>n;

if(m%2==1)
	i = m;
else
	i = m+1;

if(m<=2)
	cout<<'2'<<endl;
if(m==1)
	i= 3;
for(;i<=n;i+=2)
{
if(i%5==0 && i!=5)
{	
	
	continue;

}
int tmp = i;
int sum = 0;
while(tmp>=1)
{
sum += tmp%10; 
tmp = tmp/10;
}
if(sum%3 == 0 && i !=3)
{	
	continue;
}	
int count = 0;
for(int j = 7;j<sqrt(i);j+=2)
	if(i%j == 0)
	{
	count++;		
	break;
	}
if(count == 0)
	cout<<i<<endl;	

}

cout<<endl;
}
return 0;
}
