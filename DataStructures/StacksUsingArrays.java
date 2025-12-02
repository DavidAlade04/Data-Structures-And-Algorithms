package DataStructures;

public class StacksUsingArrays {
    
    private int maxCapacity;
    private int [] stackArray;
    private int top;


    //Default Constructor

    public void StacksUsingArray (int capacity)
    {
        maxCapacity = capacity;
        stackArray = new int[maxCapacity];
        top = -1;
    }


    public boolean isEmpty()
    {
        return (top==-1);
    }
    public boolean isFull()
    {
        return (top == maxCapacity - 1);
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow cannot push! " + x);
            return;
        }
        stackArray[++top] = x;
        System.out.println(x + " pushed to stack.");

    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow! Cannot Pop.");
            return -1;
        }
        return stackArray[top--];
    } 

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
}
