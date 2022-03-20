public class CreateDoublyLinkedList {    
  
    //Create a node for doubly linked list    
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }   
        
        
        
    } 
    
  //Initialize head and tail for the doubly linked list   
  Node head= null;
  Node tail = null; 

   //Create addNewNode() method to add a node into a list   
   public void addNewNode(String data){

    //Create node 
    Node newNode = new Node(data);    
   
        

     //Check whether our doubly linked list is empty or not   
     if(head==null){

         head= newNode;
         tail = newNode;

          //It is first node so prev will point to null    
          head.prev= null;


       //It is also last node so tail's next will point to null    
            tail.next = null;    
     }   //Execute when the doubly linked list is not empty  
     else {    

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        tail.next=null;

     }
    }

   //Create showData() method for displaying data of doubly linked list    
    public void showData() {  
        //intialize a new node current that will point to head    
  
        Node current =head;

        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while(current!=null)
            {   
                System.out.println("List element are");
                System.out.println(current.data +"\n");
                current=current.next;
            }
        }
    }


    public int countNode(){
        int cnt=0 ;
        Node current =head;

        if(head==null){
            cnt=0;
        }
        else{
            while(current!=null)
            {   
                cnt++;
                current=current.next;
                
            }
        }
    return cnt;

    }
        public static void main(String[] args) {
            CreateDoublyLinkedList createDoublyLinkedList = new CreateDoublyLinkedList();

            createDoublyLinkedList.addNewNode("Goa");
            createDoublyLinkedList.addNewNode("Maharashtra");
            createDoublyLinkedList.addNewNode("Chennai");
            createDoublyLinkedList.addNewNode("Kerala");

            createDoublyLinkedList.showData();

            System.out.println("Count of LinkList " +createDoublyLinkedList.countNode());

        }


    }