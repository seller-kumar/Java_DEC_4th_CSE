// Sample code to understand use of multiple classes in same and different locations
// Also how static keyword workss
package OOPConcepts;
public class Sample1 {
    static void myMethod() {
        System.out.println("Hello World!");
    }
    void myMethod2(int x) {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        Sample myObj = new Sample();
        myObj.x = 100;
        System.out.println(myObj.x);

        myMethod();
        Sample1 obj = new Sample1();
        obj.myMethod2(5);
        //myMethod2(5);
    }
}

