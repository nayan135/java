import java.util.*;

public class strtoarray {
    void fun() {
        // string lai sort garni
        String na = "Nayan";
        char[] arr = na.toCharArray();

        // sort the arrayy
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
