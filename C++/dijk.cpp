using namespace std;
#include<iostream>
#include<stdio.h>
int main()
{
int graph[10][10];

int visited[10];
int previous[10];
int distance[10];
int num_visited = 1;
int current_node = 0;
int vertices, edges, min_distance = 9999;
cin>>vertices;
cin>>edges;
cout<<vertices<<"  "<<edges;
int u,v,w;
for(int i = 0;i<vertices;i++)
	for(int j =0;j<vertices;j++)
		graph[i][j] = 0;
for(int i = 0;i<edges;i++)
{
cin>>u;
cin>>v;
cin>>w;
graph[u][v] = w;
}
cout<<"DONEAA!!";
int s, d;
cin>>s>>d;
cout<<"BBBBBBB";

for(int i = 0;i<vertices;i++)
{
	distance[i] = 9999;
	previous[i] = -1;
	visited[i] = 0;
}	
distance[s] = 0;
int tot_distance;
int count = 0;
while(1)
{
while(num_visited>0)
{
	current_node = -1;
	min_distance = 9999;
	for(int j = 0;j<vertices;j++)
	{
		if(distance[j]<min_distance && visited[j] != 1)
		{	
		min_distance = distance[j];
		current_node = j;
		visited[j] = 1;
		}

	}
	for(int j = 0;j<vertices;j++)
	{
	if(graph[current_node][j] > 0 && visited[j] == 0)
		{
		int alt = graph[current_node][j] + distance[current_node];
		if(alt<distance[j])
			{
			distance[j] = alt;
			previous[j] = current_node;
			}
		}
	}

num_visited = 0;
	for(int i = 0;i<vertices;i++)
		if(visited[i]==0)
			num_visited++;
}
tot_distance = distance[d];
count++;
for()
}
return 0;

}
