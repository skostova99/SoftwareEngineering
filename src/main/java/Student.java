import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Student {

    private String name;
    private String username;
    private String dob;
    private String[] modules;
    private int age;
    private int id;

    public Student(String name, String username, String dob, String[] modules, int age, int id){
        this.name = name;
        this.username = username;
        this.dob = dob;
        this.modules = modules;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getUsername(){
        return username + Integer.toString(age);
    }

    public String getDob(){
        return dob;
    }

//    public String getModules(){
//        return;
//    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }
}
