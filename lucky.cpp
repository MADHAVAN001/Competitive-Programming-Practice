using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
cin>>num;
while(num--)
{
long long int n, tmp;
long long int count = -1;
cin>>n;

tmp = n/4;
for(int i = 0;i<=tmp;i++)
{
	if(n-i*4 >=0 && (n-i*4)%7 == 0)
{
		count = n - i * 4;
		break;
}
}
if(count >=0 && n != 0)
	cout<<count<<endl;
else
	cout<<"-1"<<endl;

}
return 0;
}
