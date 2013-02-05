package lab2;

import lab1.*;

/**
 *
 * @author Machi
 */
public class DriverForLab2 {

    public static void main(String[] args) {

	//intro to programming
	ICourse myintro = new IntroToProgrammingCourse();

	System.out.println(myintro.toString());
	
	myintro.setCredits(1.0);
	
	System.out.println(myintro.toString());
	
	System.out.println();
	
	// intro to java
	ICourse myjava = new IntroJavaCourse();
	
	System.out.println(myjava.toString());
	
	System.out.println();
	
	//advanced java
	ICourse myadvjava = new AdvancedJavaCourse();
	
	System.out.println(myadvjava.toString());
	
	System.out.println();
	
	System.out.println(myadvjava.getPrerequisites());
    }
}
