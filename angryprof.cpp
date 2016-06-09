using namespace std;
#include<iostream>
#include<stdio.h>
#include<vector>
int main()
{
int t;
cin>>t;
while(t--)
{
vector <int> v;
int n,k, num_late = 0;
cin>>n>>k;
for(int i = 0;i<n;i++)
{
int p;
cin>>p;
	v.push_back(p);
if(p<=0)
	num_late++;
}
if(num_late<k)
	cout<<"YES"<<endl;
else
	cout<<"NO"<<endl;
}
return 0;
}
