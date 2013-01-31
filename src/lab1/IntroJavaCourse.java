package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Maciej
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }
    
    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber);
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

}
