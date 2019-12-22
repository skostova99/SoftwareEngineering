import java.util.ArrayList;

public class Module {

    private String moduleName;
    private Student[] students;
    private CourseProgramme[] courses;
    private int moduleId;

    public Module(String moduleName, Student[] students, CourseProgramme[] courses, int moduleId){
        this.moduleName = moduleName;
        this.students = students;
        this.courses = courses;
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public Student[]  getStudents() {
        return students;
    }

    public CourseProgramme[] getCourses() {
        return courses;
    }

    public int getModuleId() {
        return moduleId;
    }

    public String getStudentEnrolledInfo(){
        String str = "";
        for (Student s: this.students){
            str += "Student Name: " + s.getName() + "\n";
            str += "Student Username: " + s.getUsername() + "\n";
            str += "Student ID: " + s.getId() + "\n";
            str += "Student Course Enrolled: " + s.getCourse() + "\n";
            str += "Student Modules Enrolled: " + s.getModules() + "\n";
        }
        return str;
    }

//    public String getModuleInfo(){
//        String str1 = "";
//        for (Module m: this.modules){
//            str1 += "Module Name: " + m.getModuleName() + "\n";
//            str1 += "Module ID: " + m.getModuleId() + "\n";
//            str1 += "Student Enrolled: " + m.getStudents() + "\n";
//            str1 += "Associated Courses: " + m.getCourses() + "\n";
//        }
//        return str1;
//    }
}