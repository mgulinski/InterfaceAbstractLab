package lab1;

/**
 *
 * @author Machi
 */
public class DriverForLab1 {

    public static void main(String[] args) {

	ProgrammingCourse mycourse = new IntroJavaCourse();

	System.out.println(mycourse.toString());

//	mycourse.setCredits(4);

	System.out.println(mycourse.toString());
	
	
	ProgrammingCourse newcourse = new AdvancedJavaCourse();
	
	System.out.println(newcourse.toString());
    }
}
