#include<iostream>
using namespace std;
int main(){
	int a[50],n,i,j,m,t;
	cout<<"Enter the number of elements: ";
	cin >> n;
	for(i=0;i<n;i++){
		cout<<"Enter the element at "<<i <<":";
		cin>>a[i];
	}
	for(i=0;i<n-1;i++){
		m=i;
		for(j=i+1;j<n;j++){
			if(a[j]<a[m]){
				m=j;
			}
		}
		t=a[j];
		a[j]=a[m];
		a[m]=a[j];
	}
	cout<<"\n";
		for(i=0;i<n;i++){
		cout<<"sorted the elements are: "<<a[i] <<"\n";
	}
}