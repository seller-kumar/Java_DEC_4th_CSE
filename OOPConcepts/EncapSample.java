// Sample code for encapsulation
package OOPConcepts;

class Model {
    //attributes
    private String name;
    private int rollno;
    private int semester;
    //constructor
    public Model(String name, int rollno, int semester){
        this.name = name;
        this.rollno = rollno;
        this.semester = semester;
    }

    //getters
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public int getSemester(){
        return semester;
    }

    /// setters
    public void setName(String name){
        this.name = name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
}

public class EncapSample {
    public static void main(String[] args){
        Model m = new Model("DEC", 2, 1);
        m.setName("DEC2");
        System.out.println(m.getName());


    }
}
