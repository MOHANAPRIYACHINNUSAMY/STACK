class stack{
    static int top=0,size=6;
    int[]st=new int[size];
    boolean isFull()
    {
        return top==size;
    }
   
    void push(int d)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else
        {
            st[top]=d;
            top++;
        }
    }
   
    boolean isEmpty()
    {
        return top==0;
    }
    int pop()
    {
        int val= -1;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else{
            top--;
            val = st[top];
        }
        return val;
    }
   
    int peek()
    {
        int val=-1;
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        else{
            val=st[top-1];
        }
        return val;
    }
    void display()
    {
        for(int i=size-1;i>=0;i--)
        {
           
            System.out.println(st[i]);
        }
    }
   
}

class Main{
    public static void main(String[]args)
    {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println("Popped value is:"+s.pop());
        System.out.println("Peek value is:"+s.peek());
       
       
    }
}
