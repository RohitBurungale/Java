
import java.util.*;
public class Set {
    public static void main(String[] args) {
        int n=7;
        int pos=1;
        int bitmask=n<<pos;
        
        int newno=bitmask|n;
        System.err.println(newno);
    }
    
}
