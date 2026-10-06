#include<iostream>
using namespace std;
int main(){
	int a[50],n,i,j,t;
	cout<<"Enter the number of elements: ";
	cin >> n;
	for(i=0;i<n;i++){
		cout<<"Enter the element at "<<i <<":";
		cin>>a[i];
	}
	
//	for(i=0;i<n;i++){
//		cout<<"Entered the elements are: "<<a[i] <<"\n";
//	}
	for(i=0;i<n-1;i++){
		for(j=0;j<n-i-1;j++){
			if(a[i]<a[i+1]){
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
	}
	cout<<"\n";
		for(i=0;i<n;i++){
		cout<<"Entered the elements are: "<<a[i] <<"\n";
	}
}