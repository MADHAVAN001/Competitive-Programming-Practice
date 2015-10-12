using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
int main()
{
int num;
int x,y;
cin>>num;
while(num--)
{
cin>>x;
cin>>y;
int sum = x+y;

while(1)
{
sum++;
int count = 0;
if(sum%2 == 0)
	continue;
for( int i = 3;i<=sqrt(sum);i+=2)
{
if(sum%i == 0)
{
	count++;
	break;
}
}
if(count == 0)
{
	cout<<sum-x-y<<endl;
break;
}
}

}
return 0;
}
