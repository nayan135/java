
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
   
   super.eat();
    void bark() {
        System.out.println("DOGis barking.");
    }
}

public class Main {
    public static void main(String[] args) {
   
        Dog myDog = new Dog();
        myDog.bark();  
    }
}
