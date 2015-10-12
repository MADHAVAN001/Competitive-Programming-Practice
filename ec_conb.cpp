using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
int main()
{
int num;
cin>>num;
while(num--)
{
long long a,b,c;
cin>>a;
float k = log(a)/log(2);
int num_bits = k+1;
b = a<<1;
c = a - pow(2,k-1);
if(a %2 == 1)
	cout<<a<<endl;
else
	cout<<b+1 - pow(2,num_bits)<<endl;
}
return 0;
}
