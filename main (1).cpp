#include<iostream>
using namespace std;

class rectangle{
    public:
    int length;
    int breadth;
    
    rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    

    void show(){
     int area=length*breadth;
     cout<<area;
}
};
int main(){
    rectangle r1(5,5);
    r1.show();
    return 0;
}