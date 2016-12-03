using namespace std;
#include<iostream>
#include<stdio.h>
#include<map>
int main()
{
int t;
cin>>t;
std::map <string,int> v;
while(t--)
{
int n;
cin>>n;
switch(n)
{
case 1:
{
string p;
int q;
cin>>p;
cin>>q;
map<string,int>::iterator itr= v.find(p);
if(itr == v.end())
	v.insert(make_pair(p,q));
else
	{
		v[p]+=q;
	}
}
break;
case 2:
{
string p;
cin>>p;
v.erase(p);
}
break;
case 3:
{
string p;
cin>>p;
cout<<v[p]<<endl;
}
break;
}
}
return 0;
}
