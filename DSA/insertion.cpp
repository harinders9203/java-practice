#include<iostream>
using namespace std;
int main(){
	int a[100],s,e,p,i;
	cout << "Enter the size of array:";
	cin >> s;
	for(i=0;i<s;i++){
		cout << "Enter the element at "<<i<<":";
		cin>>a[i];
	}
	for(i=0;i<s;i++){
		cout << "The element at "<<i<<" is: "<<a[i] <<"\n";
	}
	cout << "Enter the element you want to insert: ";
	cin >> e;
	cout << "Enter the position you want to insert: ";
	cin >> p;
	for(i=s;i<p;i++){
		a[i]=a[i-1]; //we move the loop the forward here
	}
	a[p]=e;
	s++;
	for(i=0;i<s;i++){
		cout << "The element after insert at "<<i<<" is: "<<a[i] <<"\n";
	}
}