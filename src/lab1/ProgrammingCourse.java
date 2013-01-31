package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Machi
 */
public abstract class ProgrammingCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public ProgrammingCourse(String courseName, String courseNumber) {
	this.courseName = courseName;
	this.courseNumber = courseName;
    }
    
    
     public ProgrammingCourse(String courseName, String courseNumber, double credits) {
	this.courseName = courseName;
	this.courseNumber = courseName;
	this.credits = credits;
    }
    
  // getters and setters
     public String getCourseNumber() {
        return courseNumber;
    }
     
     public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

           
    public double getCredits() {
        return credits;
    }
// this method need to be abstract cuz there is differnt conditions for setting it 
// in particular 
    
    public abstract void setCredits(double credits); 
//    {
//        if(credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.credits = credits;
//    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
