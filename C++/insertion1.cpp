using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int n, a[1000];
cin>>n;
for(int i =0; i<n;i++)
	cin>>a[i];
int small = a[n-1];
int k = n-2;
while(a[k]>small)
{
a[k+1] = a[k];
for(int i = 0;i<n;i++)
cout<<a[i]<<" ";
cout<<endl;
k--;
}
a[k+1] = small;
for(int i = 0;i<n;i++)
cout<<a[i]<<" ";
return 0;
}
