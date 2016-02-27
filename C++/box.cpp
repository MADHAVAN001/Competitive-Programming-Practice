using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
#include<cmath>
int main()
{
int num;
cin>>num;
int a,b,x,y;
for(int i = 0;i<num;i++)
{
cin>>a;
cin>>b;
cin>>x;
cin>>y;
int num1, num2,num3, num4;
num1 = x>y?x:y;
num2 = x<y?x:y;
num3 = a<b?a:b;
num4 = a>b?a:b;
if((num1<num4 && num2<num3) || (sqrt(a*a+b*b)-(num2/(tan(atan(num4/num3))))>num1 && a*b>x*y ))
	cout<<"Escape is possible."<<endl;
else
	cout<<"Box cannot be dropped."<<endl;
}
return 0;
}
