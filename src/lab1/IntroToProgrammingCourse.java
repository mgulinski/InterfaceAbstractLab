package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Maciej
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {

    private double credits;
    
    public IntroToProgrammingCourse() {
	
	setCourseName("Introduction To Programming");
	setCourseNumber("150-100");
	setCredits(2.0);
	setPrerequisites("This class doesn't have any prerequisites");
    }

   public double getCredits() {
	return credits;
    }
    
    public final void setCredits(double credits) {

	if (credits < 0.5 || credits > 4.0) {

	    JOptionPane.showMessageDialog(null, "Error: credits must be in the range 0.5 to 4.0");
	    System.exit(0);
	}
	
	this.credits = credits;
	
    }
}
