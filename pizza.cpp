using namespace std;
#include<stdio.h>
#include<math.h>
#include<iostream>
int main()
{
int num;
char portion[10001][4];
cin>>num;
float total = 0;
float count1 = 0, count2 = 0, count3 = 0;
for(int i = 0;i<num;i++)
{
cin>>portion[i];
if(portion[i][0]=='1' && portion[i][2] == '2')
	count1++;
else if(portion[i][0]=='1' && portion[i][2] == '4')
	count2++;
else if(portion[i][0]=='3' && portion[i][2] == '4')
	count3++;
}
if(count3>count2)
	total = count3+count1/2;
else
	total = count3 + count1/2+ (count2-count3)/4;  
total += 1;
cout<<ceil(total)<<endl;
return 0;
}
