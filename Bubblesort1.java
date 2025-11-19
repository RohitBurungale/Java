//bubblesort method in string

import java.util.*;
public class Bubblesort1{

        public static void problem(int arry[]) 
        {
            for(int i=0;i<arry.length;i++)
            {
            System.out.println(arry[i]+" ");
             }
             System.out.println(" ");
        }



    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

         System.out.println("enter the array size ::");
         int size =sc.nextInt();
        int arry[]=new int [size];

        System.out.println("enter the array elements::");
        for(int i=0; i<size; i++)
        {
            arry[i] = sc.nextInt();
        }

        //bubble sort 
        for (int i=0;i<arry.length-1;i++)
        {
            for(int j=0;j<arry.length-i-1;j++)
            {
                if (arry[j]>arry[j+1])
                {
                    int temp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }

        problem(arry);
    }
}
