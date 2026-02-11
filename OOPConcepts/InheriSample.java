package OOPConcepts;
class SampleSuperClass {
    protected String name = "DEC";        // Vehicle attribute
    public void sound() {                    // Vehicle method
        System.out.println("Welcome to DEC!");
    }
}
class A extends SampleSuperClass {

}
class B extends SampleSuperClass {

}
class C extends B {

}

class InheriSample extends SampleSuperClass {
    private String nameagain = "DEC AGAIN";    // Car attribute
    public static void main(String[] args) {
        InheriSample mySample = new InheriSample();
        mySample.sound();
        System.out.println(mySample.name + " " + mySample.nameagain);
    }
}