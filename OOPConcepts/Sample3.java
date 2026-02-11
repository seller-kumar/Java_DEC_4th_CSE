// Sample code for understand access modifiers private and public

package OOPConcepts;

class Person {
    public String name = "John";   // Public - accessible everywhere
    public int age = 30;          // Private - only accessible inside this class
}

public class Sample3 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);   // Works fine
        System.out.println(p.age);    // Error: age has private access in Person
    }
}
