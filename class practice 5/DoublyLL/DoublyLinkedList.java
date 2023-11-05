package DoublyLL;
class Node{
    Node prev;
    int data;
    Node next;
}
public class DoublyLinkedList {
    Node head;
    void addFirst(int val)
    {
        Node newNode=new Node();
        newNode.data=val;
        if(head==null)
        {
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
        }
        else{
            newNode.prev=null;
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            
    }
    }
      public  void addLast(int val){
        Node newNode=new Node();
        newNode.data=val;
        if(head==null){
            newNode.next=null;
            newNode.prev=null;
            head=newNode;
            
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
        }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=null;
    }
      }
    void delete(int val){
          if(head==null)
              return;
          Node temp=head;
          while(temp!=null && temp.data!=val){
              temp=temp.next;
          }
          if(temp==null)//for head
              System.out.println("data not found");
          else if(temp==head)
          {
              head=head.next;
              head.prev=null;
          }
          else if(temp.next==null)
          {temp.prev.next=null;
          }
          if(head.next==null && head.data==val)
              head=null;
          else{
              temp.prev.next=temp.next;
              temp.next.prev=temp.prev;
          }
      }
    boolean search(int val){
          Node temp=head;
          while(temp!=null){
              if(temp.data==val)
                  return true;
              temp=temp.next;
          }
          return false;
      }

    public void printDLL(){
        System.out.println("Forward Movement...");
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next==null){
                last=temp;
            }
                
            temp=temp.next;
        }
        System.out.println("Backward Movement...");
        while(last!=null){
            System.out.println(last.data);
            last=last.prev;
        }
    }
    
        
    
    
    public static void main(String []args)
    {
        DoublyLinkedList dlld=new DoublyLinkedList();
        dlld.addFirst(100);
        dlld.addFirst(200);
        dlld.addFirst(300);
        System.out.println(dlld.search(100));
        dlld.printDLL();

        
    }
}
    