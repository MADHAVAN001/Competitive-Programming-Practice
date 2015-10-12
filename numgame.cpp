using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{

int n;
long long number;
cin>>n;
for(int i = 0;i<n;i++)
{
cin>>number;

if(number&1)
	std::cout<<"BOB"<<endl;
else
	std::cout<<"ALICE"<<endl;
}

return 0;
}
