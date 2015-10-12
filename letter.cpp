using namespace std;
#include<iostream>
#include<stdio.h>
#include<string.h>
#include<map>
#include<cctype>
int main()
{
int num;
char perm[27];
cin>>num;
std::map<char,char> mapper;
cin>>perm;
for(int i = 0;perm[i]!='\0';i++)
{
mapper[(char) 97+i] = perm[i];
}
char new_sentence[101][201];
char sentence[101][201];
while(num--)
{

cin>>sentence[num];
for(int i = 0;sentence[num][i] != '\0';i++)
{

if(sentence[num][i] == '_')
	new_sentence[num][i] = ' ';
else if(islower(sentence[num][i]))
	new_sentence[num][i] = (char)mapper[sentence[num][i]];
else if(isupper(sentence[num][i]))
	new_sentence[num][i] = toupper((char)mapper[tolower(sentence[num][i])]);
else
	new_sentence[num][i] = sentence[num][i];

}
cout<<new_sentence[num]<<endl;
}
return 0;
}
