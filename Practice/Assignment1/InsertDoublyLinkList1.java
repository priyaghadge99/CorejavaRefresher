public class InsertDoublyLinkList1 {    
  
    //Creating a node for the list    
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
    public int size = 0;    
      
    //Initializing head and tail for the list    
    Node head = null;  
    Node tail = null;    
  
    //Create firstNode() method for creating first node in the list  
    public void firstNode(Node node){  
        //The node is pointed by both head or tail   
        head = node;  
        tail = node;  
        //It is first node so prev will point to null    
        head.prev = null;    
        //It is also last node so tail's next will point to null    
        tail.next = null;     
    }  
      
    //Create lastNode() method for adding node at last in the list  
    public void lastNode(Node node){  
        //The tail's next will point to that node  
        tail.next = node;    
        //The tail is pointing to the second last node so the newly created node's prev will point to tail    
        node.prev = tail;    
        //The newly created node will become new tail because it is last node in the doubly linked list   
        tail = node;    
        //The newly created node will be the last node so tail's next will be null    
        tail.next = null;     
    }  
      
    //Create addNodeInBeginning() method for adding node at first position  
    public void addNodeInBeginning(Node node){  
        //The head's prev will point to the newNode    
        head.prev = node;    
        //The newNode's next will point to the head    
        node.next = head;    
        //The newNode's prev will point to null because it will be the first node   
        node.prev = null;    
        //The newNode will become new head because now the newly created node is the first node of the list   
        head = node;      
    }  
      
    //Creating addNewNode() method to add a node into a list   
    public void addNewNode(String data) {    
  
        //Creating node    
        Node newNode = new Node(data);    
  
        //Checking whether our list is empty or not   
        if(head == null) {  
            //Call firstNode() method to create first node in the list  
            firstNode(newNode);  
        }  
        //Execute when the list is not empty  
        else {    
            //Call lastNode() method to add a node at last in the list   
            lastNode(newNode);  
        }  
        size++;  
    }    
      
    public void addNodeToSpeciifiedPosition(int position, String data) {  
        //Creating node    
        Node newNode = new Node(data);    
  
        //Checking whether our doubly linked list is empty or not   
        if(head == null) {  
            System.out.println("The specified location is not available");  
        }  
        //Execute when the list is not empty  
        else {  
            if(position == size+1){  
                  
                //Call lastNode() method to add the node at last in the list   
                lastNode(newNode);  
                  
            }else if(position == 1){  
                  
                addNodeInBeginning(newNode);  
                  
            }else{  
                //current node will point to head    
                Node current = head;  
                Node temp = null;   
                  
                //Iterate list till current points to the specified position    
                for(int i = 1; i < position-1; i++){    
                    current = current.next;    
                }    
    
                //The temp node points to the node that is next to current    
                temp = current.next;    
                temp.prev = current;    
    
                //newNode will be added between current and temp    
                current.next = newNode;     
                newNode.prev = current;    
                newNode.next = temp;    
                temp.prev = newNode;    
            }    
            size++;  
        }  
    }  
      
    //Creating showData() method for displaying data of doubly linked list    
    public void showData() {  
        //intializing a new node current that will point to head    
        Node current = head;    
        //Checking whether the doubly linked list is empty or not  
        if(head == null) {  
            //Printing a statement and pass the control flow into the main() method  
            System.out.println("List is empty");    
            return;    
        }  
        //Printing a statement  
        System.out.println("Nodes of doubly linked list: ");    
        //Iterating the doubly linked list using while  
        while(current != null) {    
            //Print tha data on that particular node and then increment the pointer for indicating next node    
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    
  
    public static void main(String[] args) {    
  
        InsertDoublyLinkList1 obj = new InsertDoublyLinkList1();    
  
        //Adding nodes into the doubly linked list   
        obj.addNewNode("New York ");    
        obj.addNewNode("Los Angeles");    
        obj.addNewNode("Chicago");    
        obj.addNewNode("Houston");    
        obj.addNewNode("Phoenix"); 
        obj.showData(); 
        System.out.println("------------------------------");  
          
        //Adding nodes at the specified position   
        obj.addNodeToSpeciifiedPosition(6, "Philadelphia");  
        obj.showData();
        System.out.println("------------------------------");  
        obj.addNodeToSpeciifiedPosition(1, "San Antonio");  
        obj.showData();
        System.out.println("------------------------------");  
        obj.addNodeToSpeciifiedPosition(3, "San Diego");  
        System.out.println("------------------------------");  
          
        //Calling showData() method for displaying doubly linked list data    
        obj.showData();    
    }    
}  