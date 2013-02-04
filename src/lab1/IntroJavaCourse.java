package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Maciej
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private double credits;
    
    public IntroJavaCourse() {

	setCourseName("Intro To Java Programming");
	setCourseNumber("151-101");
	setCredits(3.0);
	setPrerequisites("Intro To Programming");
    }

    public double getCredits() {
	return credits;
    }
         
    public final void setCredits(double credits) {
	
	// change upper limit from 5 to 4
	if (credits < 0 || credits > 4.0) {
	    System.out.println(
		    "Error: credits must be in the range 0.5 to 4.0");
	    System.exit(0);
	}
	this.credits = credits;
    }
    
}