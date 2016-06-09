using namespace std;
#include<iostream>
#include<math.h>
int main()
{
int t;
   cin>>t;
while(t--)
{
int p;
cin>>p;
int q = p/2;
int ans = pow(2,q)*1+pow(2,q)-1;
if(p%2 == 1)
	cout<<2*ans<<endl;
else
	cout<<ans<<endl;
}
return 0;
}
