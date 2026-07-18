class Qimple{
    int size = 10, arrsize = 0, start = -1, end = -1,el;
    int[] q= new int[size];
    void push(int n)
    {
        if(arrsize == size)System.out.println("Queue is Full");
        if(arrsize==0)
        {
            start=0;
            end =0;
        }
        else
            end = (end +1 )%size;
        q[end]=n;
        arrsize++;
    }
    int pop()
    {
        if(arrsize==0)
            el=q[start];
        if(arrsize==1)
            start=end=-1;
        else
            start = (start+1)%size;
        arrsize--;
        return el;
    }
    int top()
    {
        if(arrsize==0)System.out.println("Empty!");
        return q[start];
    }
    int size()
    {
        return arrsize;
    }
}
public class QusingARR {
    public static void main(String[] args) {
        Qimple queue =  new Qimple();
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        System.out.println(queue.top());
        System.out.println(queue.size());
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue.top());
        System.out.println(queue.size());
    }
}
