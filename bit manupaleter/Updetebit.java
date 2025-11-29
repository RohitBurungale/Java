
import java.util.*;
public class Updetebit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enetr the which operation are perform 1(set) and 0(clear)");
        int oper=sc.nextInt();

        int n=5;
        int pos=1;

        int bitmask=1<<pos;
        if (oper==1)
        {
            int newno=bitmask | n;
            System.out.println("your set operation is the ::"+newno);
        }
        else{
            int notbitmask=~(bitmask);
            int newno= notbitmask & n;
            System.out.println("your get bit operation is the ::"+newno);
        }
    }
}
