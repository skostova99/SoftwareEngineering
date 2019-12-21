import org.joda.time.DateTime;
import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private ArrayList<Module> courseModules;
    private ArrayList<CourseProgramme> courseStudentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;
    // Should use Joda Time Classes (DateTime) as a dependency.

    private CourseProgramme(String courseName, ArrayList<Module> courseModules, ArrayList<CourseProgramme> courseStudentsEnrolled){
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.courseStudentsEnrolled = courseStudentsEnrolled;
    }

    private String getCourseName(){
        return courseName;
    }

    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }

    public void setEndDate(DateTime endDate){
        this.endDate = startDate.plusYears(4);
        // Assuming its an Undergraduate Degree which lasts four years
    }

    public String getCourseInfo(){
        String str2 = "";
        str2 += "Course Name" + this.courseName + "\n";
        str2 += "Associated Modules" + "\n";
        for (Module m: this.courseModules){
            str2 += "Module Name: " + Module.getModuleName() + "\n";
            str2 += "Module ID: " + Module.getModuleId() + "\n";
            str2 += "Students Enrolled: " + Module.getStudents() + "\n";
        }
        return str2;
    }
}

//    public String getCourseModules(){
//        return;
//    }

//    public String getCourseStudentsEnrolled(){
//        return;
//    }


