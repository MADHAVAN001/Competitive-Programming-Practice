using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>

int main()
{
long long int tmp;
cin>>tmp;
while(tmp--)
{
long long i,j;
cin>>i;
cin>>j;
int num = 0;
while(j != i)
{
if(j%2==0)
	{
	j = j/2;
	num++;
	}
else
	{
	j = (j-1)/2;
	num++;
	}
}
cout<<num<<endl;

}


return 0;
}
