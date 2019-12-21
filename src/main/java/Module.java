import java.util.ArrayList;

public class Module {

    private String moduleName;
    private ArrayList<Student> students;
    private ArrayList<CourseProgramme> courses;
    private int moduleId;

    public Module(String moduleName, ArrayList<Student> students, ArrayList<CourseProgramme> courses, int moduleId){
        this.moduleName = moduleName;
        this.students = new ArrayList<Student>();
        this.courses = courses;
        this.moduleId = moduleId;
    }

    public String getModuleName(){
        return moduleName;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public ArrayList<CourseProgramme> getCourses(){
        return courses;
    }

    public int getModuleId(){
        return moduleId;
    }

    public String getStudentEnrolledInfo(){
        String str = "";
        for (Student s: this.students){
            str += "Student Name: " + Student.getName() + "\n";
            str += "Student Username: " + Student.getUsername() + "\n";
            str += "Student ID: " + Student.getId() + "\n";
            str += "Student Course Enrolled: " + Student.getCourse() + "\n";
            str += "Student Modules Enrolled: " + Student.getModules() + "\n";
        }
        return str;
    }

//    public String getModuleInfo(){
//        String str1 = "";
//        for (Module m: this.modules){
//            str1 += "Module Name: " + Module.getModuleName() + "\n";
//            str1 += "Module ID: " + Module.getModuleId() + "\n";
//            str1 += "Student Enrolled: " + Module.getStudents() + "\n";
//            str1 += "Associated Courses: " + Module.getCourses() + "\n";
//        }
//        return str1;
//    }
}