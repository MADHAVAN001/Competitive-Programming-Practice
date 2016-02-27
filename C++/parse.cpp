using namespace std;
#include<iostream>
#include<fstream>
#include<stdlib.h>
char str1[4][100];

void split(char str[], char delim)
{

int k = 0, tmp = 0;
for(int i = 0; str[i] != '\0'; i++)
{
	if(str[i] == delim)
	{
		str1[k][tmp] = '\0';
		k++;		
		tmp = 0;
	}
	else
	{
		str1[k][tmp] = str[i];
		tmp++;
	} 
}
} 

int main()
{
char output[100];
int paths[216][2];
ifstream textfileread;
textfileread.open("Munich.txt");
//ostream newtextfile;
if(!textfileread.is_open())
	cout<<"File is unable to be opened";
int min = 0;
int i = 0;

while(!textfileread.eof())
{
textfileread >> output;
//cout<<output[1]<<"-->"<<output[2]<<"  ;  ";
//paths[i][0] = output[1];
//paths[i][1] = output[2];

split(output, ';');
//cout<<str1[1] << "-->" << str1[2]<<endl;
paths[i][0] = atoi(str1[1]);
paths[i][1] = atoi(str1[2]);

cout<<paths[i][0] << "-->"<< paths[i][1]<<endl;

i++;
//cout<<output<<endl;
//cout<<output[0];
}
/*
int num = 0, k = 0, tmp = 0, counter = 1;
min = 0;
while(counter< 500)
{
k = min;
tmp = 0;
for(int i = 0;i<216;i++)
	for(int j = 0;j<2;j++)
	{
		if(paths[i][j] > min && tmp == 0)
			{			
			min = paths[i][j];
			tmp++;
			}
		if(paths[i][j]<min && paths[i][j]>k && tmp == 1)
			min = paths[i][j];
	}
//cout<<min<<"  "<<counter<<endl;

for(int i = 0;i<216;i++)
	for(int j = 0;j<2;j++)
	{
	
	if(paths[i][j] == min)
		{
	//	cout<<paths[i][j]<<";"<<endl;
		paths[i][j] = counter; 
		}
	}

counter++;
}
for(int i = 0;i<216;i++)
{
	for(int j = 0;j<2;j++)
	{
		cout<<paths[i][j]<<";";
	
	}
cout<<endl;
}
*/
return 0;
}

