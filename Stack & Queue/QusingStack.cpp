#include<iostream>
#include<stack>
using namespace std;
class Qimple{
    public:
    stack<int> s1,s2;
    void push(int n)
    {
        while (s1.size())
        {
            s2.push(s1.top());
            s1.pop();
        }
        s1.push(n);
        while (s2.size())
        {
            s1.push(s2.top());
            s2.pop();
        }
    }
    int top()
    {
        return s1.top();
    }
    void pop()
    {
        s1.pop();
    }
};
int main()
{
    Qimple Queue;
    Queue.push(6);
    Queue.push(5);
    Queue.push(8);
    Queue.push(9);
    Queue.push(2);
    Queue.push(1);
    cout<<Queue.top()<<endl;
    Queue.pop();
    Queue.pop();
    Queue.pop();
    Queue.pop();
    cout<<Queue.top()<<endl;
    return 0;
}