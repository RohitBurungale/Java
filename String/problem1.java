//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.


import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();

        System.out.println("enter the"+size+" arrey elements :: ");
        String array[]=new String[size];
        int totallegth=0;
        for(int i=0;i<size;i++)
        {
            array[i]=sc.next();
            totallegth+=array[i].length();
        }
        System.out.println("totale length of  array is:: "+totallegth);
    }
}
