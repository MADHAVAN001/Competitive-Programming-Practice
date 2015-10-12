using namespace std;
#include<stdio.h>
#include<iostream>

int main()
{
long T;
long long N;
cin>>T;

for(int i = 0;i<T;i++)
	{
		cin>>N;
		if(N%2 == 0)
			std::cout<<N;
		else
			std::cout<<N-1;
	}

return 0;
}

