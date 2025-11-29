
import java.util.*;
public class Clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;

        int notbitmask=~(bitmask);

        int newno=notbitmask & n;
        System.err.println(newno);
    }
}
