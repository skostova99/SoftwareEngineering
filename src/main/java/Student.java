import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private String dob;
    private String courseEnrolled;
    private String[] modules;
    private int age;
    private int id;

    // Setters
    public Student(String name, String username, String dob, String[] modules, String courseEnrolled, int age, int id){
        this.name = name;
        this.username = username;
        this.dob = dob;
        this.modules = modules;
        this.courseEnrolled = courseEnrolled;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username + Integer.toString(age);
    }

    public String getDob() {
        return dob;
    }

    public String getCourse(){
        return courseEnrolled;
    }

    public String getModules() {
        String str = "";
        for (String s: this.modules) {
            str += s + "";
        }
        return str;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
