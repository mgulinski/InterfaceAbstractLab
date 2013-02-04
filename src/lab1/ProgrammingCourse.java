package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Machi
 */
public abstract class ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    //decided to add prerequisites to super
    private String prerequisites;
    
    // getters and setters
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

    public String getCourseName() {
	return courseName;
    }

    public final void setCourseName(String courseName) {
	if (courseName == null || courseName.length() == 0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: courseName cannot be null of empty string");
	    System.exit(0);
	}
	this.courseName = courseName;
    }

    
    public String getPrerequisites() {
	return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
	if (prerequisites == null || prerequisites.length() == 0) {
	    JOptionPane.showMessageDialog(null,
		    "Error: prerequisites cannot be null or empty string");
	    System.exit(0);
	}
	this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {

	String str = "\nCourse Info:\n--------------"
		+ "\nCourse Name:\t" + courseName
		+ "\nCourse Number:\t" + courseNumber
		+ "\nPrerequisites:\t" + prerequisites;

	return str;
    }
}
