#include <iostream>
using namespace std;

class Demo {
private:
    int num;

public:
    Demo(int n) {
    
     num=n;
     }

    // Friend function declaration
    friend void showNum(Demo obj);
};

// Friend function definition
void showNum(Demo obj) {
    cout << "The number is: " << obj.num << endl;
}

int main() {
    Demo d(10);  // Creating object of class Demo
    showNum(d);  // Calling friend function
    return 0;
}
