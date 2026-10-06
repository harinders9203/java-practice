#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};

node* head=NULL;

void atstart(int v){
	node* n=new node;
	n->data=v;
	n->next=head;
	head=n;
}

void atend(int v){
	node* n=new node;
	n->data=v;
	n->next=NULL;
	
	node* temp=head;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	
	temp->next=n;
}


void atpos(int v, int p){
	node* n=new node;
	n->data=v;
	n->next=NULL;
	node* temp=head;
	if(p==0){
		n->data=v;
		n->next=head;
		head=n;
	}
	
	for(int i=0;i<p-1;i++){
		if(temp==NULL){
			cout<<"List is empty";
		}
		
		temp=temp->next;
	}
	
	n->next=temp->next;
	temp->next=n;
}


int main(){
	int i,e,s,v,p;
	node* temp=NULL;
	cout<<"Enter the number of elements:";
	cin>>s;
	for(i=0;i<s;i++){
		cout<<"Enter the element you want to insert:";
		cin>>e;
		node* n=new node();
		n->data=e;
		n->next=NULL;
		if(head==NULL){
			head=n;
			temp=n;
		} else {
			temp->next=n;
			temp=n;
		}
	}
	temp=head;
	while(temp!=NULL){
		cout<<temp->data << "->";
		temp=temp->next;
	}
	
	
	cout<<"\nEnter the value you want to insert:";
	cin>>v;
	
	atstart(v);
	
	temp=head;
	while(temp!=NULL){
		cout<<temp->data << "->";
		temp=temp->next;
	}
	
	
	cout<<"\nEnter the value you want to insert:";
	cin>>v;
	
	atend(v);
	
	temp=head;
	while(temp!=NULL){
		cout<<temp->data << "->";
		temp=temp->next;
	}
	cout<<"\nEnter the value you want to insert:";
	cin>>v;
	cout<<"\nEnter the Position you want to insert:";
	cin>>p;
	atpos(v,p);
	temp=head;
	while(temp!=NULL){
		cout<<temp->data << "->";
		temp=temp->next;
	}
}