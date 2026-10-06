#include<iostream>
using namespace std;
class factorial{
    public:
    int fact(int n){
        if(n==1){
            return 1;
        } else{
            n=n*fact(n-1);
            return n;
        }
    }
};
int main(){
    int n;
    factorial f;
    cin >> n;
    
    cout << f.fact(n);;
}