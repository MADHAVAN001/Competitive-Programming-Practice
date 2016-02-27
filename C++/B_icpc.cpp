using namespace std;
#include<iostream>
#include<stdio.h>

int main()
{
int graph[4][4];
int choice;

for(int i = 0;i<4;i++)
	for(int j = 0;j<4;j++)
		cin>>graph[i][j];
cin>>choice;
switch(choice)
{
case 0:
{
for(int i = 0;i<4;i++)
	for(int j = 0;j<4;j++)
	{
		int tmp = 0;
		if(graph[i][j]==0)
			continue;		
		if(j!=3 && graph[i][j] == graph[i][j+1])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i][j+1] = 0;
				tmp = 1; 
			}
		if(j==3 && graph[i][j] !=0 && graph[i][j-1]==0 && graph[i][j-2]==0 && graph[i][j-3]==0)
		{
			graph[i][j-3] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}		
		if(j>=2 && graph[i][j] !=0 && graph[i][j-1]==0 && graph[i][j-2]==0)
		{
			graph[i][j-2] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}
		if(j==3 && graph[i][j] !=0 && graph[i][j-1]==0 && graph[i][j-2]==0 && graph[i][j-3]==0)
		{
			graph[i][j-3] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}		
		if(j >=1 &&graph[i][j] !=0 &&  graph[i][j] !=0 && graph[i][j-1] == 0)
			{
				graph[i][j-1] = graph[i][j];
				graph[i][j] = 0;
			}
		
		if(j == 0 &&graph[i][j] !=0 &&  tmp == 0 && graph[i][j+1] == 0 && graph[i][j] == graph[i][j+2])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i][j+2] = 0;
				tmp = 1;
			}
		if(j == 0 &&graph[i][j] !=0 &&  tmp ==0 && graph[i][j+1] == 0 && graph[i][j+2] == 0 && graph[i][j] == graph[i][j+3])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i][j+3] = 0;
				tmp = 1;
			}
		if(j==1 &&graph[i][j] !=0 &&  tmp == 0 && graph[i][j+1] == 0 && graph[i][j] == graph[i][j+2])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i][j+2] = 0;				
				tmp = 1;
			}	

}
}
break;
case 1:
{
for(int j = 0;j<4;j++)		
	for(int i = 0;i<4;i++)
	{
		int tmp = 0;
		if(graph[i][j]==0)
			continue;		
		if(graph[i][j] == graph[i+1][j])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i+1][j] = 0;
				tmp = 1; 
			}
		if(i==3 && graph[i][j] !=0 && graph[i-1][j]==0 && graph[i-2][j]==0 && graph[i-3][j]==0)
		{
			graph[i-3][j] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}
		if(i>=2 && graph[i][j] !=0 && graph[i-1][j]==0 && graph[i-2][j]==0)
		{
			graph[i-2][j] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}		

		if(i !=0 && graph[i][j] !=0 && graph[i-1][j] == 0)
			{
				graph[i-1][j] = graph[i][j];
				graph[i][j] = 0;
			}
		if(i == 0 && tmp == 0 && graph[i+1][j] == 0 && graph[i][j] == graph[i+2][j])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i+2][j] = 0;
				tmp = 1;
			}
		if(i == 0 && tmp ==0 && graph[i+1][j] == 0 && graph[i+2][j] == 0 && graph[i][j] == graph[i+3][j])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i][j+3] = 0;
				tmp = 1;
			}
		if(i==1 && tmp == 0 && graph[i+1][j] == 0 && graph[i][j] == graph[i+2][j])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i+2][j] = 0;				
				tmp = 1;
			}	

	}

}
break;
case 2:
{
for(int i = 0;i<4;i++)
	for(int j = 3;j>=0;j--)
	{
		int tmp = 0;
		if(graph[i][j]==0)
			continue;		
		if(j!=0 && graph[i][j] == graph[i][j-1])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i][j-1] = 0;
				tmp = 1; 
			}
		if(j==0 && graph[i][j] !=0 && graph[i][j+1]==0 && graph[i][j+2]==0 && graph[i][j+3]==0)
		{
			graph[i][j+3] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}
		if(j<2 && graph[i][j] !=0 && graph[i][j+1]==0 && graph[i][j+2]==0)
		{
			graph[i][j+2] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}		
		if(j !=3 && graph[i][j] !=0 && graph[i][j+1] == 0)
			{
				graph[i][j+1] = graph[i][j];
				graph[i][j] = 0;
			}
		if(j == 3 && tmp == 0 && graph[i][j-1] == 0 && graph[i][j] == graph[i][j-2])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i][j-2] = 0;
				tmp = 1;
			}
		if(j == 3 && tmp ==0 && graph[i][j-1] == 0 && graph[i][j-2] == 0 && graph[i][j] == graph[i][j-3])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i][j-3] = 0;
				tmp = 1;
			}
		if(j==2 && tmp == 0 && graph[i][j-1] == 0 && graph[i][j] == graph[i][j-2])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i][j-2] = 0;				
				tmp = 1;
			}	

	}

}
break;
case 3:
{
for(int j = 0;j<4;j++)	
	for(int i = 3;i>=0;i--)
	{
		int tmp = 0;
		if(graph[i][j]==0)
			continue;		
		
		if(i==0 && graph[i][j] !=0 && graph[i+1][j]==0 && graph[i+2][j]==0 && graph[i+3][j]==0)
		{
			graph[i+3][j] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}
		if(i<2 && graph[i][j] !=0 && graph[i+1][j]==0 && graph[i+2][j]==0)
		{
			graph[i+2][j] = graph[i][j];
			graph[i][j] = 0;
			continue; 
		}		
		if(graph[i][j] == graph[i-1][j])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i-1][j] = 0;
				tmp = 1; 
			}
		if(i !=3 && graph[i][j] !=0 && graph[i+1][j] == 0)
			{
				graph[i+1][j] = graph[i][j];
				graph[i][j] = 0;
			}
		if(i == 3 && tmp == 0 && graph[i-1][j] == 0 && graph[i][j] == graph[i-2][j])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i-2][j] = 0;
				tmp = 1;
			}
		if(i == 3 && tmp ==0 && graph[i-1][j] == 0 && graph[i-2][j] == 0 && graph[i][j] == graph[i-3][j])
			{
				graph[i][j] = 2* graph[i][j];
				graph[i-3][j] = 0;
				tmp = 1;
			}
		if(i==2 && tmp == 0 && graph[i-1][j] == 0 && graph[i][j] == graph[i-2][j])
			{
				graph[i][j] = 2*graph[i][j];
				graph[i-2][j] = 0;				
				tmp = 1;
			}	

	}

}
break;
}
for(int i = 0;i<4;i++)
{
	for(int j = 0;j<4;j++)
		cout<<graph[i][j]<<" ";
	cout<<endl;
}
return 0;
}
