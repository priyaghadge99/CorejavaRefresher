public class StackedArray {

    int ary[];
   
     // Default value of top variable when stack is empty 
    int top = -1;
      // Variable to store size of array
    int size;


    // Constructor of this class
    // To initialize stack
    StackedArray(int size){
       this.size= size;
    // Creating array of Size = size
       this.ary= new int[size];
       
   }


	public void push(int val ) { 
       
        // Checking if array is full
        if(top +1  == size ){
         System.out.println("StackArray is full");
        }
        else{
            //add element at top
            System.out.println("Enter value in StackArray--" +val);
           // Increment top to go to next position
            top++;
            ary[top]= val; 
            System.out.println("Item pushed ----"+ary[top]+"-----");  

            
        }


    }
	public void pop()  {
         // If stack is empty
        if(top== -1){
            System.out.println("underflow");

        }else{
             // Delete the last element
            // by decrementing the top
            top--;
            System.out.println("Item Pop----"+ary[top]);
        }


    }

    private void showData() {
        for(int i=top;i>=0;i--){
            System.out.println("StackArray Element Are:---"+ary[i]);
        }
    }
    
    
public static void main(String[] args) {
    
    StackedArray obj = new StackedArray(4);
    obj.showData();
    System.out.println("====================================");
    obj.push(4);
    obj.push(6);
    obj.push(8);
    obj.push(0);
    obj.push(0);
    System.out.println("====================================46800push");
    obj.showData();

    System.out.println("====================================");
    obj.push(6);
    System.out.println("====================================");
    obj.pop();
    System.out.println("===========after pop=================");
    obj.showData();
    System.out.println("====================================");
    
}
}