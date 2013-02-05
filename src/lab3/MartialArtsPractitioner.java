package lab3;

/**
 *
 * @author Machi
 */
public abstract class MartialArtsPractitioner implements IAthlete{
    
    private String name;
    private int age;
       
    private int speedLevel;
    private int strengthLevel;
    private int boxingLevel;
    
    private int kickingLevel;
    private int grapplingLevel;
    private int wrestlingLevel;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
    
    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

        public int getSpeedLevel() {
	return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
	this.speedLevel = speedLevel;
    }

    public int getStrengthLevel() {
	return strengthLevel;
    }

    public void setStrengthLevel(int strengthLevel) {
	this.strengthLevel = strengthLevel;
    }

    public int getBoxingLevel() {
	return boxingLevel;
    }

    public void setBoxingLevel(int boxingLevel) {
	this.boxingLevel = boxingLevel;
    }

    public int getKickingLevel() {
	return kickingLevel;
    }

    public void setKickingLevel(int kickingLevel) {
	this.kickingLevel = kickingLevel;
    }

    public int getGrapplingLevel() {
	return grapplingLevel;
    }

    public void setGrapplingLevel(int grapplingLevel) {
	this.grapplingLevel = grapplingLevel;
    }

    public int getWrestlingLevel() {
	return wrestlingLevel;
    }

    public void setWrestlingLevel(int wrestlingLevel) {
	this.wrestlingLevel = wrestlingLevel;
    }
}
    

