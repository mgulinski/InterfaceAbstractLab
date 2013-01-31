package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Maciej
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse{
    
       public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
	
	super.setPrerequisites("Prerequisite for this class is Intro To Programming.");
    }
    
    public IntroJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber);
	
	super.setPrerequisites("Prerequisite for this class is: Intro To Programming.");
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
