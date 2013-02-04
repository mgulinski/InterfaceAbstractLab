package lab1;

/**
 *
 * @author Machi
 */
public class DriverForLab1 {

    public static void main(String[] args) {

	//intro to programming
	ProgrammingCourse myintro = new IntroToProgrammingCourse();

	System.out.println(myintro.toString());
	
	System.out.println();
	
	// intro to java
	ProgrammingCourse myjava = new IntroJavaCourse();
	
	System.out.println(myjava.toString());
	
	System.out.println();
	
	//advanced java
	ProgrammingCourse myadvjava = new AdvancedJavaCourse();
	
	System.out.println(myadvjava.toString());
    }
}
