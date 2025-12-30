package LinkedLists;

public class LinkedList {
    private int length;
    private Node head;
    private Node tail;


    class Node
    {
        int value;
        Node next;


        Node(int value)
        {
            this.value = value;
        }
    }
    public LinkedList(int value)
    {
        Node newNode = new Node(value);

        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node getHead()
    {
        return head;
    }
    public Node getTail()
    {
        return tail;
    }

    public void append(int value)
    {
        Node newNode = new Node(value);
        if(length ==0)
        {
            head = newNode;
            tail = newNode;

        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast()
    {
        if(length==0) return null;
        Node aheadPointer = head;
        Node delayedPointer = head;

        while(aheadPointer.next != null)
        {
            delayedPointer = aheadPointer;
            aheadPointer = aheadPointer.next;
        }

        tail = delayedPointer;
        tail.next = null;
        length--;

        if(length == 0)
        {
            tail = null;
            head = null;
        }
        return aheadPointer;
    }


    public void prepend(int value)
    {

        
        Node newNode = new Node(value);
        if(length == 0)
        {
            head = newNode;
            tail = newNode;
            
        }
        else
        {newNode.next = head;
        head = newNode;}
        length++;
    }

    public Node removeFirst()
    {
        Node currentNode = head;
        if(length==0) return null;

            
            head = head.next;
            currentNode.next = null;
            length--;
            if(length==0)
            {
                tail = null;
            }


        
        return currentNode;
    }

    public Node get(int index)
    {
        Node tempHead = head;
        if(index < 0 || index >= length )
        {
            return null;
        }

        int counter = 0;
        while(counter < index)
        {
            tempHead = tempHead.next;
            counter++;
        }
        return tempHead;

    }
    public boolean set(int index, int value)
    {
        Node tempNode = get(index);
        
        if(tempNode!= null)
        {
            tempNode.value = value;
            return true;
        }
        return false;
    }
    public boolean insert(int index, int value)
    {
        if(index < 0 || index > length) return false;

        if(index==0)
        {
            prepend(value);
            return true;
        }
        if(index == length)
        {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node backwardNode = get(index-1);
        Node originalNode = get(index);
        backwardNode.next = newNode;
        newNode.next = originalNode;
        length++;
        return true;
    }

    public Node remove(int index)
    {
        if (index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == length - 1) return removeLast();

        Node prevNode = get(index - 1);
        Node currentNode = prevNode.next;
        prevNode.next = currentNode.next;
        currentNode.next = null;
        length--;
        
        return currentNode;
        
    }
    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        for(int i = 0; i < length; i++)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    
}
