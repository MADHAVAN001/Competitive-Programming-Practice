using namespace std;
#include<iostream>
int main()
{
int N;
int A[100][100];
cout<<"Enter the value of N: ";
cin>>N;

for(int i = 0;i<N;i++)
	for(int j = 0;j<N;j++)
		{
			A[i][j] = 0;
		}	
int B[100][100];
for(i = 0;i<N;i++)
	for(j = 0;j<N;j++)
		{
			B[i][j] = A[i][N-j];
		}

}

