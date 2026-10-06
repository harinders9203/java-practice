#include<iostream>
using namespace std;
struct node{
	int data;
	node* next;
};

int main(){
	int s,data,i;
	node* head=NULL;
	node* temp=NULL;
	cout<<"Enter the no. of elements you want to insert:";
	cin>>s;
	for(i=0;i<s;i++){
		cout<<"Enter the element:";
		cin>>data;
		node* new_data=new node();
		new_data->data=data;
		new_data->next=NULL;
		
		if(head==NULL){
			head=new_data;
			temp=new_data;
		}else{
			temp->next=new_data;
			temp=new_data;
		}
		
	}
		temp=head;
		while(temp!=NULL){
			cout<<temp->data << "->";
			temp=temp->next;
		}
	}