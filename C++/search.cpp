using namespace std;
#include<iostream>
#include<stdio.h>
int binary(int a[], int start, int end, int value)
{
int mid = (start+end)/2;
if(value>a[end-1])
	return -1;
if(a[mid] == value)
	return mid;
else
	if(a[mid]>value)
		return binary(a,start, mid-1, value);
	else
		return binary(a,mid+1,end, value);
}
int main()
{
int n;
cin>>n;
int a[10000];
for(int i = 0;i<n;i++)
	cin>>a[i];
int value;
cin>>value;
int pos = binary(a,0,n,value);

return 0;
}
