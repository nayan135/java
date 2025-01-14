 class finall {
    void finall(){
       final int a = 20;
        int b = 30;
        System.out.println("sum: " + (a + b));
    }
}

 public class finall extends finall {
    void finall(){
        
         int a = 20; 
        int b = 10;
    
        System.out.println("multiply: " + (a * b));
    }

    public static void main(String args[]){
        finale f = new finale();
        f.fun();
    }
}
