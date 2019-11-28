public class CourseProgramme {

    private String courseName;
    private Module[] courseModules;
    private Student[] courseStudentsEnrolled;
//    private String startDate;
//    private String endDate;
    // Should use Joda Time Classes (DateTime) as a depend.

    private CourseProgramme(String courseName, Module[] courseModules, Student[] courseStudentsEnrolled){
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.courseStudentsEnrolled = courseStudentsEnrolled;
    }

    private String getCourseName(){
        return courseName;
    }

//    public String getCourseModules(){
//        return;
//    }

//    public String getCourseStudentsEnrolled(){
//        return;
//    }
}
