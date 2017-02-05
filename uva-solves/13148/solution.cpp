#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	long long int n;
	while(cin>>n){
		if(n==0){
			break;
		}
		if(n==1 || n==4 || n==64 || n==729 || n==4096){
			cout<<"Special"<<endl;
		}
		else if(n==15625 || n==46656 || n==117649 || n==262144 || n==531441){
			cout<<"Special"<<endl;
		}
		else if(n==1000000 || n==1771561 || n==2985984 || n==4826809 || n==7529536){
			cout<<"Special"<<endl;
		}
		else if(n==11390625 || n==16777216 || n== 24137569 || n==34012224){
			cout<<"Special"<<endl;
		}
		else if(n==47045881 || n==64000000 || n==85766121){
			cout<<"Special"<<endl;
		}
		else{
			cout<<"Ordinary"<<endl;
		}
		
	}
	
	return 0;
}