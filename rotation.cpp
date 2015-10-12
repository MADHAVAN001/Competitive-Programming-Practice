using namespace std;
#include<iostream>
#include<stdio.h>


int main()
{
long m,n;
long A[100001];
long flag = 0;
cin>>n;
cin>>m;

for(int i = 0;i<n;i++)	
	cin>>A[i];

while(m--)
{
char a;
long d;
cin>>a;
cin>>d;
if(a == 'A')
	flag = flag + n - d;
if(a == 'C')
	flag = flag + d; 
if(a == 'R')
	cout<<A[(n+flag+d-1)%n]<<endl;

}

return 0;
}
