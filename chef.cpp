using namespace std;
#include<iostream>
#include<stdio.h>

void qsort(int a[], int num)
{
int lowest = 0;
int tmp;
int tmp_stor;
for(int i = 0;i<num;i++)
{
lowest = a[i];
tmp = i;
for(int j = i+1;j<num;j++)
{
	if(a[j]<lowest)
	{
		lowest = a[j];
		tmp = j;
	}
}
tmp_stor = a[i];
a[i] = lowest;
a[tmp] = tmp_stor;
}

}

int num_count(int weight[], int pie[], int num)
{
int count = 0;
int i = 0;
int j = 0;
while(j<num)
{
if(weight[i]<=pie[j])
	{	
	count++;
	i++;
	j++;
	}
else
	j++;
}
return count;
}


int  main()
{
int num;
cin>>num;

for(int i = 0;i<num;i++)
{
int a;
int weight[100];
int pie[100];
cin>>a;

for(int j = 0;j<a;j++)
{
cin>>weight[j];
}
for(int j = 0;j<a;j++)
{
cin>>pie[j];
}

qsort(weight, a);
qsort(pie,a);
cout<<num_count(weight,pie,a)<<endl;

}


return 0;

}
