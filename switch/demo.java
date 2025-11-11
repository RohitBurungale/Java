
import java.util.*;



class demo{
     
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1 value:");
       int a=sc.nextInt();
         System.out.println("Enter 2 value:");
         int b=sc.nextInt();
          
         System.out.println("Enter your choice:\n1:Sum\n2:Subtraction\n3:Multiplication\n4:Division");
        
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Sum is:"+(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction is:"+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication is:"+(a*b));
                    break;
                case 4:
                    System.out.println("Division is:"+(a/b));
                    break;
                default:
                    System.out.println("Invalid choice");
            }



  
  
    }

}
