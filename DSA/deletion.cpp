#include<iostream>
using namespace std;
int main(){
	int a[100],s,e,p,i;
	cout<<"Enter the size of array: ";
	cin>>s;
	for(i=0;i<s;i++){
		cout<<"Enter the element at a["<<i<<"] :";
		cin>>a[i];
	}
	for(i=0;i<s;i++){
		cout<<"The element at a["<<i<<"] is: "<<a[i]<<"\n";
	}
	cout<<"Enter the position you want to insert: ";
	cin>>p;
	for(i=p;i<s;i++){
		a[i]=a[i+1];
	}
	s--;
	for(i=0;i<s;i++){
		cout<<"The elements after deletion is " <<a[i] <<"\n";
	}
}