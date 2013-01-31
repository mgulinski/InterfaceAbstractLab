package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Maciej
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    
// constructors
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
       super(courseName, courseNumber);
    }
    
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
       super(courseName, courseNumber, credits);
    }

 // overriding setter method
    
   public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }

    } 
    
       
}
