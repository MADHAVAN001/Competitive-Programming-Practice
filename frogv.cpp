using namespace std;
#include<iostream>
#include<stdio.h>

int  arr[100005], y[100005], b[100005];

int inline inp()
{
    int n=0;
    char c=getchar_unlocked();
    while(c < '0' || c >'9') {c=getchar_unlocked();}
    while(c>='0' && c<='9')
    {
    n=(n<<3)+(n<<1)+c-'0';
    c=getchar_unlocked();
    }
    return n;
}

void quicksort(int arr[], int left, int right)
{
int i = left, j = right;
int tmp;
int pivot = arr[(left+right)/2];

while(i<=j)
{
while(arr[i]<pivot)
	i++;
while(arr[j]>pivot)
	j--;
tmp = arr[i];
arr[i] = arr[j];
arr[j] = tmp;
i++;
j--;
};
if(left<j)
	quicksort(arr,left,j);
if(i<right)
	quicksort(arr,i,right);

}


int main()
{
int n,k,p, z = 1;
n = inp();
k = inp();
p = inp();
for(int i = 1;i<=n;i++)
{
	y[i] = i;
	arr[i] = inp();
}
quicksort(arr,1,n);

b[1] = z;

for(int i = 1;i<=n;i++)
{
	if(arr[i+1]-arr[i] <= k )
	{
		b[y[i]] = z;
		b[y[i+1]] = z;
	}
	else
	{
		z++;
		b[y[i+1]] = z;
	}
}
while(p--)
{
int a,b1;
a = inp();
b1 = inp();
if(b[a] == b[b1])
	cout<<"Yes"<<endl;
else
	cout<<"No"<<endl;

}


return 0;
}
