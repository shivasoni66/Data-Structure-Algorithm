class STimple
{
    public  int top = -1;
    public int[] st = new int[10];
    void push(int n)
    {
        if(top>=10);
            top++;
        st[top] = n;
        
    }
    int top()
    {
        if(top == -1)
            System.out.println("Stack is empty");
        return st[top];
    }
    void pop()
    {
        if(top == -1)
            System.out.println("empty!");
        top--;
    }
    int size()
    {
        return top+1;
    }
}
public class STusingARR {
    public static void main(String[] args) 
    {
        STimple stack = new STimple();
        stack.push(6);
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(8);
        System.out.println(stack.top());
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
    }
}
