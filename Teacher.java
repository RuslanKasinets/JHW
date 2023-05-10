package HW18;
   /*       Write a Java program called Teacher.
        Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
        ChemistryTeacher and PianoTeacher . Test all 4 classes*/
public class Teacher { String name;
    int age;
    String gender;
    String subject;

    Teacher(String name, int age, String gender, String subject) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
    }

    public void isTeaching(){
        System.out.println(name +" "+ age+" "+gender+" is teaching.");
    }

    public void isSleeping(){
        System.out.println(name +" "+ age+" "+gender+ " is sleeping.");
    }

    public void isEating(){
        System.out.println(name+"" + age+" "+gender+" "+subject+" is eating.");
    }
}

class MathTeacher extends Teacher {
    MathTeacher(String name, int age, String gender) {
        super(name, age, gender, "math");
    }
}

class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name, int age, String gender) {
        super(name, age, gender, "chemistry");
    }
}

class PianoTeacher extends Teacher {
    PianoTeacher(String name, int age, String gender) {
        super(name, age, gender, "piano");
    }

    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("Ricky", 33, "male");
        ChemistryTeacher chemistryTeacher = new ChemistryTeacher("John", 44, "male");
        PianoTeacher pianoTeacher = new PianoTeacher("Dann", 23, "male");

        mathTeacher.isTeaching();
        chemistryTeacher.isEating();
        pianoTeacher.isSleeping();
    }
}

