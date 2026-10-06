#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};

int main(){
	int i,s,value;
	
	node* head=NULL;
	node* temp=NULL;
	cout << "Enter the number of nodes you want to insert:";
	cin >> s;
	for(i=0;i<s;i++){
		cout<<"Enter the elements:";
		cin >> value;
		node* newnode=new node();
		newnode->data=value;
		newnode->next=NULL;
		
		if(head==NULL){
			head=newnode;
			temp=newnode;
		}
		else{
			temp->next=newnode;
			temp=newnode;
		}
	}
	cout << "Linked List: ";
    temp = head;
    while(temp != NULL) {
        cout << temp->data << " ";
        temp = temp->next;
}}