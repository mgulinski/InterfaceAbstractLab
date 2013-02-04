package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    public AdvancedJavaCourse() {

	setCourseName("Advanced Java Programming");
	setCourseNumber("152-102");
	setPrerequisites("Intro To Java Programming.");
    }

    public String getCapitalizedCourseName() {
	return this.getCourseName().toUpperCase();
    }

    public void setCredits(double credits) {
	if (credits < 0.5 || credits > 4.0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: credits must be in the range 0.5 to 4.0");
	    System.exit(0);
	}
	this.setCredits(credits);
    }
}
