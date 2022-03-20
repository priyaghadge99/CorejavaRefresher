public class DeleteDoublyLinkList {

     
  
        //Create a node for DDL    
        class Node{    
            String data;    
            Node prev;    
            Node next;    
      
            public Node(String data) {    
                this.data = data;    
            }    
        }    
      
        int size = 0;  
          
        //Initialize head and tail for DDL    
        Node head = null;  
        Node tail = null;    
      
          
          
        //Create addNewNode() method to add a node into DDL   
        public void addNewNode(String data) {    
      
            //Creating node    
            Node newNode = new Node(data);    
      
            //Checking whether our DDL is empty or not   
            if(head == null) {  
                //The newNode is pointed by both head or tail   
                head = newNode;  
                tail = newNode;  
                //It is first node so prev will point to null    
                head.prev = null;    
                //It is also last node so tail's next will point to null    
                tail.next = null;    
            }  
            //Execute when the DDL is not empty  
            else {    
      
                //The newly created node will be the last node, so now tail's next will point to that newly created node  
                tail.next = newNode;    
                //The tail is pointing to the second last node so the newly created node's prev will point to tail    
                newNode.prev = tail;    
                //The newly created node will become new tail because it will be last node in the DDL   
                tail = newNode;    
                //The newly created node will be the last node so tail's next will be null    
                tail.next = null;    
            }  
            //Increment the size of DDL  
            size++;  
        }  
          
        //Create deleteFirstNode() method for deleting first node from DDL  
        public void deleteFirstNode(){  
            head = head.next;  
        }  
          
        //Create deleteLastNode() method for deleting last node from DDL  
        public void deleteLastNode(){  
            tail = tail.prev;  
        }  
          
        //Create deleteNodeAtSpecifiedLocation() method for deleting a node from DDL  
        public void deleteNodeAtSpecifiedLocation(int position){  
      
            //Check whether the DDL is empty or not   
            if(head == null || position>size) {  
                System.out.println("\n" +position +"th position is not available\n");  
            }  
            //Execute when the DDL is not empty  
            else {  
                if(position == 1){  
                      
                    //Call deleteFirstNode() method to delete first node from the DDL   
                    deleteFirstNode();  
                      
                    //Decrement the size of DDL  
                    size--;  
                      
                }else if(position == size){  
                    //Call deleteLastNode() method to delete last node from the DDL  
                    deleteLastNode();  
                      
                    //Decrement the size of DDL  
                    size--;  
                      
                }else{  
                    //current node will point to head    
                    Node current = head;  
                      
                    //Iterate list till current points to the specified position    
                    for(int i = 1; i < position; i++){    
                        current = current.next;    
                    }   
                      
                    //Delete node pointed by current  
                    current.next.prev = current.prev;  
                    current.prev.next = current.next;  
                    
                }  
                System.out.println(position +" node is deleted successfully from DDL");  
            }  
        }  
          
          
        //Create showData() method for displaying data of DDL    
        public void showData() {  
            //intialize a new node current that will point to head    
            Node current = head;    
            //Check whether the DDL is empty or not  
            if(head == null) {  
                //Print a statement and pass the control flow into the main() method  
                System.out.println("List is empty");    
                return;    
            }  
            //Print a statement  
            System.out.println("Nodes of doubly linked list: ");    
            //Iterate the DDL using while  
            while(current != null) {    
                //Print tha data on that particular node and then increment the pointer for indicating next node    
                System.out.print(current.data + "\n");    
                current = current.next;    
            }    
        }    
      
        public static void main(String[] args) {    
      
         DeleteDoublyLinkList obj = new DeleteDoublyLinkList();    
      
            //Add nodes into the DDL   
            obj.addNewNode("New York");    
            obj.addNewNode("Los Angeles");    
            obj.addNewNode("Chicago");    
            obj.addNewNode("Houston");    
            obj.addNewNode("Phoenix");    
              
            //Call showData() method for displaying DDL data    
            obj.showData();    
            System.out.println("============================");
            //Delete nodes from the DDL  
            obj.deleteNodeAtSpecifiedLocation(2);
            obj.showData();   
            System.out.println("============================");
            obj.deleteNodeAtSpecifiedLocation(1);  
            obj.showData(); 
            System.out.println("============================");
            obj.deleteNodeAtSpecifiedLocation(5);  
              
            //Call showData() method for displaying DDL  
            obj.showData();    
        }    
    }   

    
    

    

