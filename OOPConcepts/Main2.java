package OOPConcepts;
/// sample code for super calling parent method and attributes
class Animal2 {
    String type = "Animal";
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    String type = "Dog";
    public void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
    public void printType() {
        System.out.println(super.type); // Access parent attribute
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.animalSound();
        myDog.printType();
    }
}
