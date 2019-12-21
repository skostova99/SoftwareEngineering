import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private String dob;
    private ArrayList<Module> modules;
    private CourseProgramme courseEnrolled;
    private int age;
    private int id;

    // Setters
    public Student(String name, String username, String dob, ArrayList<Module> modules, CourseProgramme courseEnrolled, int age, int id){
        this.name = name;
        this.username = username;
        this.dob = dob;
        this.modules = modules;
        this.courseEnrolled = courseEnrolled;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getUsername(){
        return username + Integer.toString(age);
    }

    public String getDob(){
        return dob;
    }

    public CourseProgramme getCourse(){
        return courseEnrolled;
    }

    public ArrayList<Module> getModules(){
        return modules;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }
}
