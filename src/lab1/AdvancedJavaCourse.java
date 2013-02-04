package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private double credits;

    public AdvancedJavaCourse() {

	setCourseName("Advanced Java Programming");
	setCourseNumber("152-102");
	setCredits(4.0);
	setPrerequisites("Intro To Java Programming.");
    }

    public String getCapitalizedCourseName() {
	return this.getCourseName().toUpperCase();
    }

    public double getCredits() {
	return credits;
    }
    
    public final void setCredits(double credits) {

	if (credits < 0.5 || credits > 4.0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: credits must be in the range 0.5 to 4.0");
	    System.exit(0);
	}
	this.credits = credits;
    }
    
    @Override
    public String toString() {
	
	String str = super.toString() + "\nCredits:\t" + credits;
	
	return str;
    }
}
