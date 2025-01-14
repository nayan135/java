public class conn {
    int id;
    String name;

    conn(int i, String s) {
        id = i;
        name = s;
    }

    conn(conn a) {
        id = a.id;
        name = a.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        conn c = new conn(1, "NAAA");
        conn b = new conn(c);
        c.display();
        b.display();
    }
}
