#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};
node* head=NULL;


void atbeg(int value){
	node* n1=new node;
	n1->data=value;
	n1->next=head;
	head=n1;
}


void atend(int value){
	node* n1=new node();
	n1->data=value;
	n1->next=NULL;

//	if(head == NULL) {
//        head = n1;
//        return;
//    }
    
	node* temp=head;
	while(temp->next != NULL){
		temp=temp->next;
	}
	
	temp->next=n1;
}


void atpos(int value,int pos){
	node* n1=new node;
	n1->data=value;
	
	if(pos==0){
		n1->next=head;
		head=n1;
	}
	node* temp=head;
	for(int i=0;i<pos-1;i++){
		if(temp==NULL){
			cout<<"List is empty;";
		}
		
		temp=temp->next;
	}
	
	n1->next=temp->next;
	temp->next=n1;
}



int main(){
	int i,n,e,p;
	node* temp=NULL;
	cout<<"Enter the number of elements:";
	cin>>n;
	for(i=0;i<n;i++){
		cout<<"Enter the elements:";
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
		cout << temp->data << "->";
		temp=temp->next;
	}
	
	cout<<"Enter the Elemnt you want to store at beggining:";
	cin>>e;
	cout<<"Enter the position:";
	cin>>p;
//	atbeg(e);
	
//	atend(e);

	atpos(e,p);
	
	temp=head;
	while(temp!=NULL){
		cout << temp->data << "->";
		temp=temp->next;
	}
}