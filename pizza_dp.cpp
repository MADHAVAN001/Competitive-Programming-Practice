using namespace std;
#include<iostream>
#include<stdio.h>
inline int inp()
{
    int noRead=0;
    char p=getchar_unlocked();
    for(;p<33;)
    {
     p=getchar_unlocked();
    };
    while(p>32)
    {
     noRead = (noRead << 3) + (noRead << 1) + (p - '0');
     p=getchar_unlocked();
    }
    return noRead;
};

int main()
{
int num;
num = inp();
while(num--)
{
int k;
int num_delivery[505],dp[10001] = {0}, fuel_station[505], max = 0, min = 9999, answer = 0;
k = inp();
for(int i = 0;i<k;i++)
	{
	num_delivery[i] = inp();
	num_delivery[i] = 2* num_delivery[i];
	if(num_delivery[i]>max)
		max = num_delivery[i];
	}
for(int i = 0;i<k;i++)
	{
	fuel_station[i] = inp();	
	dp[fuel_station[i]] = 1;
	}


for(int i = 1;i<=max;i++)
	{
		if(!dp[i])
		{
			min = 9999999;
			for(int j = 1; j<=i/2;j++)
			{
				if(dp[j]+dp[i-j] <min)
					min = dp[j]+dp[i-j];
			}
			dp[i] = min;
		}
	}
	for(int i = 0;i<k;i++)
		answer+=dp[num_delivery[i]];
printf("%d\n",answer);
}
return 0;
}
