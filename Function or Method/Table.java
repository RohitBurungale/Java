//Make a function to print the table of a given number n.
import java.util.*;
public class Table {
    public static void printtable(int n)
    {       int a=0;
        for(int i=1;i<=10;i++)
        {
            a=n*i;
            System.out.println((a));
        }
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the no to print table :");
        int n=sc.nextInt();
        printtable(n);
    }
    
}
