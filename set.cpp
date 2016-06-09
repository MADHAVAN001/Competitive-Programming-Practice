using namespace std;
#include<iostream>
#include<stdio.h>
#include<set>
int main()
{
set <int> v;
int t;
cin>>t;
while(t--)
{
int type, k;
cin>>type>>k;
if(type == 1)
	v.insert(k);
else
	if(type == 2)
		v.erase(k);
else
	if(type == 3)
		{
		set<int>::iterator pos = v.find(k);
		if(pos == v.end())
			cout<<"No"<<endl;
		else
			cout<<"Yes"<<endl;
		}	
}
return 0;
}
