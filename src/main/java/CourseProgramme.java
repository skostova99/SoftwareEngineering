import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private String courseStudentsEnrolled;
    private Module[] courseModules;
    private DateTime startDate;
    private DateTime endDate;
    // Should use Joda Time Classes (DateTime) as a dependency.

    private CourseProgramme(String courseName, Module[] courseModules, String courseStudentsEnrolled, DateTime startDate) {
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.courseStudentsEnrolled = courseStudentsEnrolled;
        setDates(startDate);
    }

    private void setDates(DateTime startDate) {
        this.startDate = startDate;
        this.endDate = startDate.plusWeeks(12);
        // Assuming its an twelve week semester excluding exams etc.
    }

    private String getCourseName() {
        return courseName;
    }

//    public void setStartDate(DateTime startDate) {
//        this.startDate = startDate;
//    }
//
//    public void setEndDate(DateTime endDate) {
//        this.endDate = startDate.plusWeeks(12);
//    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public String getCourseInfo() {
        String str2 = "";
        str2 += "Course Name" + this.courseName + "\n";
        str2 += "Associated Modules" + "\n";
        for (Module m : this.courseModules) {
            str2 += "Module Name: " + m.getModuleName() + "\n";
            str2 += "Module ID: " + m.getModuleId() + "\n";
            str2 += "Students Enrolled: " + m.getStudents() + "\n";
        }
        return str2;
    }

    public Module[] getCourseModules() {
        return courseModules;
    }

    public String getCourseStudentsEnrolled() {
        return courseStudentsEnrolled;
    }
}


