using namespace std;
#include<iostream>
long long a[900][900], dist[900], visited[900];

int main()
{
int t;
cin>>t;
while(t--)
{
int n; //denotes the number of cities
cin>>n;
int e;
cin>>e; //denotes the number of edges
//cities from 0 to n-1
for(int i = 0;i<n;i++)
	for(int j = 0;j<n;j++)
		a[i][j] = 0;
while(e--)
{
int p,q,w;
cin>>p>>q>>w;
p = p-1;	//coverting convention to start from 0
q = q-1;
a[p][q] = w;
}
for(int i = 0;i<n;i++)
{
dist[i] = 9999999;
visited[i] = 0;
}
long long source, destination;
cin>>source;
cin>>destination;
dist[source-1] = 0;		//0 is the source node
int num_visited = 0;
int prev = 0;
while(num_visited !=n)
{
prev = num_visited;
long long min_dist = 9999999, node_num = -1;

for(int i = 0;i<n;i++)
{
if(visited[i] == 0 &&  dist[i]<min_dist)
	{
	min_dist = dist[i];
	node_num = i;
	}
}
visited[node_num] = 1;

for(int i = 0;i<n;i++)
	if(a[node_num][i] > 0)
		{
			int alt = dist[node_num]+a[node_num][i];
			if(alt<dist[i])
				dist[i] = alt;
		}
num_visited = 0;
for(int i = 0;i<n;i++)
{
if(visited[i] == 1)
	num_visited++;
}
if(num_visited == prev)
	break;
}
//for(int i =0;i<n;i++)
if(dist[destination-1] > 999999)
	cout<<"NO"<<endl;
else
	cout<<dist[n-1]<<endl;
}
return 0;
}
