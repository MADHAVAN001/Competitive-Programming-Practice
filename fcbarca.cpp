using namespace std;
#include<iostream>
#include<stdio.h>
#define MOD 1000000007
int main()
{
int num;
cin>>num;
long long dp[1001] = {0};
dp[0] = 1;
dp[1] = 0;
while(num--)
{
int n,k;
cin>>n;
cin>>k;
for(int i = 2;i<=n;i++)
	dp[i] = ((k-1)*dp[i-1]+k*dp[i-2])%MOD;
cout<<dp[n]<<endl;
}
return 0;
}
