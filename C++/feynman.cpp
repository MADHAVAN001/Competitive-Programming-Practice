using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
int main()
{
int num = 1;
while(1)
{
cin>>num;
long long sum = 0;
if(num == 0)
	break;
for(int i = 1;i<=num;i++)
	sum += pow((num-i)+1,2);
cout<<sum<<endl;
}
return 0;
}
