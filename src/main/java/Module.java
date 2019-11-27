public class Module {

    private String moduleName;
    private String[] students;
    private String[] courses;
    private int moduleId;

    public Module(String moduleName, String[] students, String[] courses, int moduleId){
        this.moduleName = moduleName;
        this.students = students;
        this.courses = courses;
        this.moduleId = moduleId;
    }

    public void getCourses(){
        return;
    }
}