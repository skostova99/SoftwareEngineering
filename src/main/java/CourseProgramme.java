public class CourseProgramme {

    private String courseName;
    private String[] courseModules;
    private String[] courseStudentsEnrolled;
//    private String startDate;
//    private String endDate;
    // Should use Joda Time Classes (DateTime) as a depend.

    private CourseProgramme(String courseName, String[] courseModules, String[] courseStudentsEnrolled){
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.courseStudentsEnrolled = courseStudentsEnrolled;
    }
}
