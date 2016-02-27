using namespace std;
#include<iostream>
#include<stdio.h>


class Stack {
private:
      int top;
      char storage[500];
public:
      Stack() {
            top = -1;
      }
 
      void push(char value) {
            top++;
            storage[top] = value;
      }
 
      char peek() {
            return storage[top];
      }
 
      void pop() {
            top--;
      }
 
      bool isEmpty() {
            return (top == -1);
      }
};

int main()
{
char exp[401];
int num;
cin>>num;
Stack a, ops;
int j;

for(int i = 0;i<num;i++)
{
cin>>exp;

for(j = 0;exp[j]!='\0';j++)
{
if(exp[j]>='a'&&exp[j]<='z')
{
a.push(exp[j]);
}
if(exp[j]=='-' || exp[j]=='*' || exp[j]=='/' || exp[j]=='^' || exp[j]=='+')
{
	ops.push((char)exp[j]);	
}
if(exp[j] == ')')
{
	a.push((char)ops.peek());
ops.pop();
}
}

Stack k;

while(!a.isEmpty())
{
k.push(a.peek());
a.pop();
}
while(!k.isEmpty())
{
cout<<(char)k.peek();
k.pop();
}
cout<<endl;
}


return 0;
}
