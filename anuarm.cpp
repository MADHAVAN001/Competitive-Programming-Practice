using namespace std;
#include<iostream>
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
int num;
cin>>num;
while(num--)
{
unsigned long long n,m, m_iter, g_value[1000001];
cin>>n;
cin>>m;
for(int i = 0;i<m;i++)
{
cin>>m_iter;
	for(int j = 0;j<n;j++)
{
	if(g_value[j]<abs(m_iter-j))
		g_value[j] = abs(m_iter-j);
}

}

for(int i = 0;i<n;i++)
	cout<<g_value[i]<<" ";

cout<<endl;


}
return 0;
}
