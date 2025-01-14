class Room {
    int length;
    int breadth; 
    Room(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int show() { 
        return length * breadth;
    }
}
class Bed extends Room {
    int height;
    Bed(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    int showw() {  
        return length * breadth * height;
    }
}
public class InheritanceDemo { 
    public static void main(String[] args) {
        Bed r = new Bed(10, 20, 30);
        System.out.println(r.show()); 
        System.out.println(r.showw());
    }
}
