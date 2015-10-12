using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num = 0;
int arr[100];
int i = 0;
while(cin>>num)
{

if(num !=42)
	arr[i] = num;
	i++;
}

for(int j = 0;j<i;j++)
	cout<<arr[i]<<endl;

return 0;
}
