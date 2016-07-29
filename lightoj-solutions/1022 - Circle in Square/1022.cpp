#include <iostream>
#include <cmath>
#include <stdio.h>
using namespace std;

int main() {

    double height, radius, pi;
    
    pi = 2*acos(0.0);
    int x, y;
    
    y = 1;
    
    cin >> x;
    
    while( y <= x ) {

        cin >> radius;
        height = 2*radius;
        
        printf("Case %d: %.2lf\n", y, ((height*height) - (pi*radius*radius)));
        
        y++;
    }
    
    return 0;
}