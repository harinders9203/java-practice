/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
using namespace std;
struct node{
    int data;
    node* next;
};
int main()
{
    int i,n,d;
    node* head=NULL;
    node* temp=NULL;
    cout<<"Enter the size of list:";
    cin>>n;
    for(i=0;i<n;i++){
        cin>>d;
        node* n1=new node();
        n1->data=d;
        n1->next=n1;
        
        if(head==NULL){
            head=n1;
            temp=n1;
        } else{
            temp->data=n1;
            temp=n1;
        }
    }
    temp=head;
    while(temp!=NULL){
        cout<< temp->data <<"->";
        temp=temp->next;
    }
}