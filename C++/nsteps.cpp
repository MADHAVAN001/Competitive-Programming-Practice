using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int num;
cin>>num;
for(int i = 0;i<num;i++)
{
int x,y,op_num;
cin>>x;
cin>>y;
if(x==y)
{
if(x%2==0)
{
	op_num = (x+y);
	cout<<op_num<<endl;
}
else
{
	op_num = (x+y)-1;
	cout<<op_num<<endl;
}	
}
else if(x == y+2)
{
	
if(x%2==0)
{
	op_num = (x+y);
	cout<<op_num<<endl;
}
else
{
	op_num = (x+y)-1;
	cout<<op_num<<endl;
}	
}
else
{
cout<<"No Number"<<endl;
}

}
return 0;
}
