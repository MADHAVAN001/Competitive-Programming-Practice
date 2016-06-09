using namespace std;
#include<iostream>
#include<algorithm>
#include<vector>
int main()
{
vector <int> v;
int n;
cin>>n;
for(int i = 0;i<n;i++)
{
int k;
cin>>k;
v.push_back(k);
}
//now sorting begins
sort(v.begin(),v.end());
//now printing begins
for(int i = 0;i<n;i++)
cout<<v.at(i);
return 0;
}
