using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
cin>>num;
while(num--)
{
int x,y,k,n,c,p;
cin>>x;
cin>>y;
cin>>k;
cin>>n;
int count = 0;
for(int i = 0;i<n;i++)
{
cin>>p;
cin>>c;
if(x - y - p <= 0 && c<=k)
	count++;
}
if(count>0)
	cout<<"LuckyChef"<<endl;
else
	cout<<"UnluckyChef"<<endl;

}

return 0;
}
