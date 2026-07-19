#include<iostream>
#include<queue>
using namespace std;
class STimple{
    public:
    queue<int> q;
    void push(int n)
    {
        int s=q.size();
        q.push(n);
        for(int i=0; i<s; i++){
            q.push(q.front());
            q.pop();
        }
    }
    void pop()
    {
        q.pop();
    }
    int top()
    {
        return q.front();
    }
};
int main()
{
    STimple Stack;
    Stack.push(10);
    Stack.push(9);
    Stack.push(8);
    Stack.push(7);
    Stack.push(6);
    cout<<Stack.top()<<endl;
    Stack.pop();
    Stack.pop();
    Stack.pop();
    cout<<Stack.top()<<endl;
}