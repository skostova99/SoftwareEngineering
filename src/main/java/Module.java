public class Module {

    private String moduleName;
    private Student[] students;
    private String[] courses;
    private int moduleId;

    public Module(String moduleName, Student[] students, String[] courses, int moduleId){
        this.moduleName = moduleName;
        this.students = students;
        this.courses = courses;
        this.moduleId = moduleId;
    }

    public String getModuleName(){
        return moduleName;
    }

//    public String getStudents(){
//        return;
//    }

//    public String getCourses(){
//        return;
//    }

    public int getModuleId(){
        return moduleId;
    }
}