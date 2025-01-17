import java.util.*;

public class strtoarray {
    void fun() {
        String n = "Nayan";
        char[] arr = n.toCharArray();
        
        // sort the arrayy
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String args[]) {
        strtoarray s = new strtoarray();
        s.fun();
    }
}
