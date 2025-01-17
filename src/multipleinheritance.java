interface A {
    void show();
}

interface B {
    void display();
}

class multipleinheritance implements A, B {
    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }

    public static void main(String[] args) {
        multipleinheritance obj = new multipleinheritance();
        obj.show();
        obj.display();
    }

}
