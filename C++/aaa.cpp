using namespace std;
#include<iostream>
int abc(double,int &);
int main()
{
int x = 13; double y = 3.1415; 
abc((int)y, x);
return 0;
}
int abc(double H, int &r)
{
cout<<H*r;
}

