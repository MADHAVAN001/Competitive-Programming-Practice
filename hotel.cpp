using namespace std;
#include<stdio.h>
#include<iostream>
int main()
{
int t;
cin>>t;
while(t--)
{
int a[100][2];
int b[1001][1];
int n;
cin>>n;
for(int i = 0;i<1001;i++)
	b[i][0] = 0;
for(int i = 0;i<2;i++)
	for(int j = 0;j<n;j++)
		cin>>a[j][i];
for(int i = 0;i<n;i++)
	for(int j = a[i][0];j<a[i][1];j++)
		b[j][0]+=1;
int max = 0;
for(int i = 0;i<1001;i++)
	if(b[i][0]>max)
		max = b[i][0];
cout<<max<<endl;
}
return 0;
}
