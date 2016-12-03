using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int n, a[1000];
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
		}
	else
		break;
a[j+1] = k;
}
for(int j = 0;j<n;j++)
	cout<<a[j]<<" ";
cout<<endl;

return 0;
}
