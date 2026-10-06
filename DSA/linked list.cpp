#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};
int main(){
	node* n1=new node();
	n1->data=10;
	
	node* n2=new node();
	n2->data=20;
	
	node* n3=new node();
	n3->data=30;
	
	
	n1->next=n2;
	n2->next=n3;
	n3->next=NULL;
	
	node* head =n1;
	
	node* temp=head;
	
	while(temp!=NULL){
		cout<<temp->data <<"->";
		temp=temp->next;
	}
}