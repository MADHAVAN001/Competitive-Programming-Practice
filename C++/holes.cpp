using namespace std;

#include<stdio.h>
#include<iostream>

int main()
{
int num_lines;
int count[50];
char text[50][100]; 
std::cout<<"This is the program to count number of holes in text";
std::cout<<endl<<"Please enter the number of lines follwed by each of the lines: ";

cin>>num_lines;

for(int i = 0;i<num_lines;i++)
	{
	cin>>text[i];
	count[i] = 0;
	for(int j = 0;text[i][j] != '\0';j++)
	{
		if(text[i][j] == 'A' || text[i][j] == 'O' || text[i][j] == 'R' || text[i][j] == 'D' || text[i][j] == 'P' ||text[i][j] == 'Q')
			count[i]++;
		else if(text[i][j] == 'B')
			count[i]+=2;
	}
	}
std::cout<<endl;
for(int i = 0;i<num_lines;i++)
	std::cout<<count[i]<<endl;
return 0;
}
