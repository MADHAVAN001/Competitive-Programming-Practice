using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int n, a[1000], num = 0;
cin>>n;
for(int i = 0;i<n;i++)
	cin>>a[i];
for(int i = 1;i<n;i++)
{
int k = a[i],j;
for(j = i-1;j>=0;j--)
	if(k<a[j])
		{
			a[j+1] = a[j];
			num++;	
		}
	else
		break;
a[j+1] = k;
}
cout<<num<<endl;

return 0;
}
