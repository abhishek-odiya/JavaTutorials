package Array;

import java.util.Scanner;

public class AlgoOfArray {

    // Conductor code
    static void printArray(int[] arr){ // Algorithm Initilisation/ Defination.   
        System.out.println("Total Element inside the array: ");
            for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
    
    static void insertInArray(int[] arr){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Element of Array: ");
            for(int i =0; i<=arr.length-1;i++){
                arr[i]=sc.nextInt();
            }
    }
    static void UpdateArray(int[] arr,int pos,int value){
            if(pos<0 || pos>arr.length){        // Checking Overflow and Underflow
                System.out.println("Position out of range");
            }
            System.out.println("Value of " + pos + " Element is change to " + value);
            arr[pos-1]=value;
    }



    // Driver Code
    public static void main(String[] args) {
    //     int[] a={1,2,1,3,2,9,8,7,4,5};
    //    // AlgoOfArray ag=new AlgoOfArray();
    //     printArray(a);

        // int[] arr= new int[5];
        // insertInArray(arr);
        // printArray(arr);

        int[] a={1,2,1,3,2,9,8,7,4,5};
        printArray(a);
        UpdateArray(a, 6, 78);
        printArray(a);
    }
}
