/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
using namespace std;
class student{
    public:
    student(){
        cout<<"constructor called"<<endl;
    }
};
class child{
    public:

    child(){
        cout<<"construtor is success";
    }
};


int main()
{
    student s1;
    child c1;
    

    return 0;
}