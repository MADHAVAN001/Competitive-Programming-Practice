//this is the server program for terminal based chatroom

using namespace std;
#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<unistd.h>
#include <sys/types.h> 
#include <sys/socket.h>
#include <netinet/in.h>
#include<arpa/inet.h>

void error(const char *msg)
{
	perror(msg);
	exit(1);
}

int main(int argc, char *argv[])
{
int socket_address,newsocket_address, port_number;
socklen_t clilen;
char buffer[256];
struct sockaddr_in server_addr, client_addr;
int n;
if(argc<2)
	std::cout<<"No port is provided for server";
socket_address = socket(AF_INET,SOCK_STREAM,0);
if(socket_address<0)
	std::cout<<"Error opening socket";
bzero((char*) &server_addr, sizeof(server_addr));
port_number = atoi(argv[1]);
server_addr.sin_family = AF_INET;
server_addr.sin_addr.s_addr = INADDR_ANY; 
server_addr.sin_port = htons(port_number);
if(bind(socket_address,(struct sockaddr *)&server_addr,sizeof(server_addr))<0)
	std::cout<<"Error in binding";
listen(socket_address,100);
clilen = sizeof(client_addr);

newsocket_address = accept(socket_address,(struct sockaddr *) &client_addr, &clilen);
if(newsocket_address<0)
	std::cout<<"Error on accepting";
std::cout<<"Got connection to server from "<<inet_ntoa(client_addr.sin_addr)<<" port "<< ntohs(client_addr.sin_port);
bzero(buffer,256);
n = read(newsocket_address, buffer, 255);
if(n<0)
	std::cout<<"could not read the name of the chatroom from "<<inet_ntoa(client_addr.sin_addr);
std::cout<<"The chatroom connected by "<< inet_ntoa(client_addr.sin_addr) << " is "<<buffer;

return 0;
}
