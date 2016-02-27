using namespace std;
#include<stdio.h>
#include<iostream>

int main()
{
int total_number,n;
cin>>total_number;

for(int i = 0 ;i<total_number;i++)
	{
		cin>>n;

		if(360%n == 0)
			cout<<"y ";
		else
			cout<<"n ";

		if(n<360)
			cout<<"y ";
		else
			cout<<"n ";
		if(n<27)
			cout<<"y";
		else
			cout<<"n";
	cout<<endl;

	}

return 0;
}

