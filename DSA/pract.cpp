#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};
int main(){
	int i,n,e;
	node* head=NULL;
	node* temp=NULL;
	cout<<"Enter the no of elements:";
	cin>>n;
	for(i=0;i<n;i++){
		cout<<"Enter the elements:";
		cin>>e;
		node* n= new node;
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
		cout<<temp->data <<"->";
		temp=temp->next;
	}
}