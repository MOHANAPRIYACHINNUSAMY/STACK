class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}

class Stack{
    Node top=null;
    static int size = 0;
   
    void push(int d){
        Node node=new Node(d);
        if(top == null)
        {
            top=node;
        }
        else
        {
            node.next=top;
            top=node;
        }
        size++;
    }
   

   
    void display()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data );
            temp=temp.next;
        }
        System.out.println();
    }
   
    boolean isEmpty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val=top.data;
        top=top.next;
        size--;
        return val;
    }
   
    int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val=top.data;
        return val;
    }
}
   
    class Main{
        public static void main(String[]args)
        {
            Stack st=new Stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
           
            st.display();
            st.pop();
            st.display();
            System.out.println(st.peek());
           
        }
    }

/*

OUTPUT:
50
40
30
20
10


40
30
20
10

40

*/