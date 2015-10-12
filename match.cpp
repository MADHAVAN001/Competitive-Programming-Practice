using namespace std;
#include<iostream>
#include<stdio.h>
#include<string.h>

int main()
{
int t;
cin>>t;
while(t--)
{
char a[11],b[11];
cin>>a;
cin>>b;
int k = 0,p = 0;
for(int i = 0;a[i]!='\0';i++)
{
if(a[i] == b[i] || a[i] == '?' || b[i] == '?')
	p++;
else
	k = 1;
}

if(k==1)
	cout<<"No"<<endl;
else
	cout<<"Yes"<<endl;

}
return 0;
}
