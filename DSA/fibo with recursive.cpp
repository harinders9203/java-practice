#include<iostream>
using namespace std;
class fibonacci{
	public:
		int fibo(int n){
			if(n==1){
				return 1;
			} else {
				n=n+fibo(n-1);
				return n;
			}
		}
};
int main(){
	fibonacci f;
	int n;
	cout << "Enter the number:";
	cin >> n;
	int r=f.fibo(n);
	cout << r;
}