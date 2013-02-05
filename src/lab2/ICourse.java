
package lab2;

/**
 * @author Machi
 */
public interface ICourse {
    
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    

    public abstract double getCredits();
    public abstract void setCredits(double credits);
    

    public String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);
    

    public String getCourseName(); 
    public abstract void setCourseName(String courseName);
    
    @Override
    public abstract String toString();        
}
