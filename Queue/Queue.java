package Queue;

public class Queue {
    int[] data = new int[10];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;  
    }


    boolean isFull(){
        return rear == data.length-1;

    }

    boolean isEmpty(){
        // return front == -1;
        return front == -1 || front > rear;         //Proper empty condition
    }

    void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is Full");
        }
        else if(isEmpty()){
            // front +=1;
            // rear +=1;
            front = 0;
            rear = 0;
            data[rear]=value;
        }else{
            rear +=1;
            data[rear]=value;
        }
    }
    int dequeue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("Nothing to Delete, Queue is Empty");
            return -1;
        }

            value = data[front];
            front +=1;

            if(front > rear){
                front = -1;
                rear = -1;  //front and rear should reset to -1, After Deleting all element
                System.out.println("All Element has Deleted");
            }
            
                //   value = data[front];
                //   front +=1;
            
        
        return value;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            for(int i =front;i<=rear;i++){
                System.out.print(data[i]+" ");
            }
            System.out.println();
        }
    }
}
