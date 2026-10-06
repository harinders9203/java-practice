//bubble sort
#include<iostream>
using namespace std;
int main(){
	int n=11,temp;
	int a[50]={1,2,3,4,5,6,7,8,9,0,43};
	for (int j=0;j<n-1;j++){
	for(int i=0;i<n-j-1;i++){
		if(a[i]<a[i+1]){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		} 
	}
	}
	for(int i=0;i<n;i++){
		cout<< a[i];
	}
}