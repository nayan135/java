public class Cpycn {
    int id;
    String name;
 Cpycn(int i, String s) {
        id = i;
        name = s;
    }
 Cpycn() {
    }
    void display() {
        System.out.println(id + " " + name);
    }
 public static void main(String[] args) {
        Cpycn c = new Cpycn(1, "NAAA");
        Cpycn b = new Cpycn();
   
        b.id = c.id;
        b.name = c.name;
        c.display();
        b.display();
    }
}
