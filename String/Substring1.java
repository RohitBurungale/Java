import java.util.*;

public class Substring1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("enter the starting index upto ");
        int indexupto =sc.nextInt();
        System.out.println("enetr the ending index to:");
        int endto=sc.nextInt();
        if(indexupto<=name.length()||endto>=name.length()){
            String name1=name.substring(indexupto,endto);
            String name2=name.substring(endto);
             String name3=name.substring(indexupto);
            System.out.println("betwen there idex is::"+name1);
            System.out.println("start formto"+name3);
            System.out.println("up to endto"+name2);
        }else
        {
            System.out.println("there are data are not write");
        }

    }
    
}
