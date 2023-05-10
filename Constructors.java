package HW17;
/*   Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,
   default,protected), and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.  */
public class Constructors {
    String name;
    char gender;
    int age;
    public Constructors(String name){
        this.name=name;
        System.out.println(this.name);

    }
    private Constructors(char gender){
        this.gender=gender;
        System.out.println(this.gender);
    }
    protected Constructors(int age) {
        this.age = age;
        System.out.println(this);
    }

    public static void main(String[] args) {
        Constructors inf=new Constructors("Rick");
        Constructors inf2=new Constructors('f');
        Constructors inf3=new Constructors(29);
    }



}
