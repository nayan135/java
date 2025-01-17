import java.util.*;

public class strtoarray {
    void fun() {

        String na = "Nayan";
        // reverse the string
        String reverse = new StringBuffer(na).reverse().toString();
        System.out.println(reverse);

        // sort the arrayy
        char[] arr = na.toCharArray();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // string ko array lai sort garni
        String n[] = { "Nayan", "HELLO", "WHATHAPPEN" };

        Arrays.sort(n);
        System.out.println(Arrays.toString(n));

    }

    public static void main(String args[]) {
        strtoarray s = new strtoarray();
        s.fun();
    }
}
