using namespace std;
#include<iostream>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<unistd.h>
#include <netinet/in.h>
#include<arpa/inet.h>

int main(int argc, char* argv[]){

int sockfd, newsockfd, port_number;
port_number = itoa(argc);
char buffer[256];
std::cout<<"Client side implementation of the chatroom"<<endl;
struct sockaddr_in server_addr;
if(argc<3)
	fprintf(stderr, "usage of %s hostname port\n", argv[0]);
port_number = atoi(argv[2]);
sockfd = socket(AF_INET, SOCK_STREAM, 0);
if(sockfd<0)
	std::cout<<"ERROR opening socket";
server = gethostbyname(agrv[1]);
if(server == NULL)
	std::cout<<"ERROR connecting to the server on hostname "<<argv[1]<<" port "<<argv[2];








return 0;
}
