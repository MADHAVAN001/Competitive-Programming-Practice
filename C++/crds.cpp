using namespace std;
#include<iostream>
#include<stdio.h>

long long int recursion(int n)
{
/*
if(n < 1)
	return 0;
if(n==1)
	return 2;
else */
//	return recursion(n-1)+3*n-1;
return 3*(n*(n+1)/2) - n;
}



int main()
{
int num;
cin>>num;
while(num--)
{
int num_cards;
cin>>num_cards;
long long int count = recursion(num_cards)%1000007;
cout<<count<<endl;
}
return 0;
}
