public class QueuedArray {
    int size, front=-1,rear=-1;
    int arr[];



    //constructor of class
    QueuedArray(int size){
        this.size= size;
        this.arr= new int[size];

    }

    public void push(int item){
        if(rear==size-1){
           System.out.println("Can't enqueue as the queue is full\n");

        }
        else{
            if(front ==-1){
                front = 0;
            }
            rear = rear+1;
            arr[rear] = item;
            System.out.println("we have enqueue---"+item);
        }

    }

 void pop(){
      if(front==-1){
          System.out.println("queue is empty");

      }
      else{
          //delete element of queue from front
          // front -1+1 =0 
             // 0+1=1
          System.out.println("we have dequeue --=====---"+arr[front]);
          front=front+1;
          //System.out.println("we have dequeue --:-"+arr[front]);

           //Only happens when the last element was dequeued
        if(front > rear){
	        front = -1;
	        rear = -1;
        }
      }


}
    private void showData(){
        if(rear==-1){
            System.out.println("Unable to display queue coz queue is empty");
        }
        else{
            for(int i=front ;front<=rear ;i++){
                System.out.println("QueueArray is----"+arr[i]);
    
            }
        }
        
    }





public static void main(String[] args) {
    QueuedArray queuedArray = new QueuedArray(4);

queuedArray.push(9);
queuedArray.push(0);
queuedArray.push(8);
System.out.println("============================");
queuedArray.pop();
System.out.println("==========after pop=================");

System.out.println("============================");
queuedArray.push(6);

System.out.println("============================");
System.out.println("==========after push==================");
queuedArray.showData();




}

}
