public class strcheck {
    // normal string and string builder classes and print thier hashcode
        public static void main(String[] args) {
  
        String str = "NAYAN";
        System.out.println("String Hash Code: " + str.hashCode());
        System.out.println("String Identity Hash Code: " + System.identityHashCode(str));
        str="hhhhh";
        System.out.println("String Hash Code2: " + str.hashCode());
        System.out.println("String Identity Hash Code2: " + System.identityHashCode(str));
        StringBuilder sb = new StringBuilder("ACHARYA");
        System.out.println("StringBuilder Hash Code: " + sb.hashCode());
        System.out.println("StringBuilder Identity Hash Code: " + System.identityHashCode(sb));
        sb.reverse();
        System.out.println("StringBuilder Hash Code AFTER: " + sb.hashCode());
        System.out.println("StringBuilder Identity Hash Code AFTER: " + System.identityHashCode(sb));


     
    }
}