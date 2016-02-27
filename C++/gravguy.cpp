using namespace std;
#include<iostream>
#include<stdio.h>


int up(char a[],char b[])
{
int count = 0, tmp = 0,bin = 0;
if(a[0]=='#')
	return 0;
else
{
while(a[tmp]!='\0')
{
if(bin == 0)
	{
		if(a[tmp] != a[++tmp] && a[tmp-1] == '.')
			{
			bin = 1;
			count++;
			}
	}
else
{
		if(b[tmp] != b[++tmp] && b[tmp-1] == '.')
			{
			bin = 0;
			count++;
			}
}

}

}


return count;
}


int down(char a[],char b[])
{
int count = 0, tmp = 0,bin = 1;
if(b[0]=='#')
	return 0;
else
{
while(a[tmp]!='\0')
{
if(bin == 0)
	{
		if(a[tmp] != a[++tmp] && a[tmp-1] == '.')
			{
			bin = 1;
			count++;
			}
	}
else
{
		if(b[tmp] != b[++tmp] && b[tmp-1] == '.')
			{
			bin = 0;
			count++;
			}
}

}

}


return count;
}


int main()
{
int num;
cin>>num;
for(int i=0;i<num;i++)
{
char a[200001], b[200001];
cin>>a;
cin>>b;

int count = 0;
for(int j = 0;a[j]!='\0';j++)
{
if(a[j]=='#' && b[j]=='#')
{	count++;
break;
}
}
if(count==0)
{
	cout<<"Yes"<<endl;
	int up_count = up(a,b), down_count = down(a,b);	
	if(down_count==0)
		cout<<up_count-1<<endl;
	else
	if(up_count==0)
		cout<<down_count-1<<endl;
	else if(up_count<down_count)
		cout<<up_count<<endl;
	else
		cout<<down_count<<endl;
}
else
	cout<<"No"<<endl;

}
return 0;
}
