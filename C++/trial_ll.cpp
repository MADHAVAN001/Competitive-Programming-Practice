using namespace std;
#include<iostream>
struct Node{
int data;
Node *next;
};

int main()
{
int num;
std::cout<<"Enter the data of the new node being created: ";
std::cin>>num;
Node *ptr;
ptr->data = num;
std::cout<<"The data from the node is: "<<ptr->data<<endl;
Node new_node;
new_node.data = 10;
ptr->next = &new_node;
std::cout<<"The next number is: "<<ptr->next->data;

return 0;
}
