import junit.framework.TestCase;
import junit.*;

public class Tests extends TestCase {
    public void setUp() throws Exception {
    }

    public void tearDown() throws Exception {
    }

    // Testing the Username
    public void Test1() throws Exception {
        Student s1;
        String modules[] = {"EE445"};
        s1 = new Student("Sisi", "s.kostova1@nuigalway.ie", "04/02/1999", modules, "4BP", 20, 16405782);

        // Test 1
        String expectedName = "Sisi";
        String actualName = s1.getName();

        try {
            assertEquals(expectedName, actualName);
        } catch (Exception e) {
            System.out.println("The name given is not equal to the actual");
            throw e;
        }
        System.out.println("The name given is equal to the actual");

//        // Test 2
//        String expectedUsername = "s.kostova1@nuigalway.ie";
//        String actualUsername = s1.getUsername();
//
//        try {
//            assertEquals(expectedUsername, actualUsername);
//        }
//        catch (Exception e) {
//            System.out.println("The username given is not equal to the actual");
//            throw e;
//        }
//        System.out.println("The username given is equal to the actual");
//
//        // Test 3
//        String expectedDOB = "04/02/1999";
//        String actualDOB = s1.getDob();
//
//        try {
//            assertEquals(expectedDOB, actualDOB);
//        }
//        catch (Exception e) {
//            System.out.println("The DOB given is not equal to the actual");
//            throw e;
//        }
//        System.out.println("The DOB given is equal to the actual");
//    }

    }
}
