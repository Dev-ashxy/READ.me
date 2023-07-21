class LL
{
    node head;

class Node
{
    String data;
    Node next;

    Node(String data)
    {
        this.data=data;
        this.next=null;

    }
}

public addFirst(String data)
{
    Node new=new Node(data)
    if(head==null)
    {
        head=new Node;
    
    return;}
    new Node.next=head;
    head=new Node;
}
public static void main(String[]args)
{
  LL list=new LL();
  list.addFirst("hello");
  list.addFirst("World");
}

}
