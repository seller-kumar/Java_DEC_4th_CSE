package OOPConcepts;
/// sample code for super calling parent constructor
class Animal3 {
    Animal3() {
        System.out.println("Animal is created");
    }
}

class Dog3 extends Animal3 {
    Dog3() {
        super(); // Call parent constructor
        System.out.println("Dog is created");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog3 myDog = new Dog3();
    }
}
