using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
int main()
{
int n;
cin>>n;
for(int i = 0;i<n;i++)
{
int num;
cin>>num;
int count = 0;
int j = 1;
while((int)num/pow(5,j)>0)
{
count += (int)num/pow(5,j);
j++;
}
cout<<count<<endl;
}
return 0;
}
