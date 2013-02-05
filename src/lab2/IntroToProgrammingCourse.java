package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse implements ICourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroToProgrammingCourse() {

	this.setCourseName("Introduction To Programming");
	this.setCourseNumber("100");
	this.setCredits(2.0);
	this.setPrerequisites("No Prerequisites");

    }

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
	this.setCourseName(courseName);
	this.setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
	return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
	if (courseNumber == null || courseNumber.length() == 0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: courseNumber cannot be null or empty string");
	    System.exit(0);
	}
	this.courseNumber = courseNumber;
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

    public String getPrerequisites() {
	return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {

	if (prerequisites == null || prerequisites.length() == 0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: prerequisites cannot be null or empty string");
	    System.exit(0);
	}
	this.prerequisites = prerequisites;
    }

    public String getCourseName() {
	return courseName;
    }

    public final void setCourseName(String courseName) {
	if (courseName == null || courseName.length() == 0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: courseName cannot be null or empty string");
	    System.exit(0);
	}
	this.courseName = courseName;
    }
    
    
    @Override
    public String toString() {

	String str = "\nCourse Info:\n--------------"
		+ "\nCourse Name:\t" + courseName
		+ "\nCourse Number:\t" + courseNumber
		+ "\nCredits:\t" + credits
		+ "\nPrerequisites:\t" + prerequisites;

	return str;
   
    }
}
