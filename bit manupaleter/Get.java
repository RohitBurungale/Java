
import java.util.*;

public class Get {
    public static void main(String[] args) {
        int n=6;
        int pos=1;
        int bitmask=n<<pos;
        if((bitmask & n)==0){
            System.out.println("the bit was zero");
        }
        else{
            System.out.println("the bit was one");
        }
    }
}
