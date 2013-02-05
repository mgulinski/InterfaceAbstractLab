package lab3;

/**
 *
 * @author Machi
 */
public class MartialArtist extends MartialArtsPractitioner

{
    public void canRun() {
	System.out.println("I'm running");
    }
    
    
    public void canJump() {
	System.out.println("I'm jumping!");
    
    }
    public void canTrain() {
	
	System.out.println("I'm training!");
    
    
    }

    public FightingStyle getFightingStyle() {
	return this.fightStyle;
    }

    public void setFightingStyle(FightingStyle fightStyle) {
	throw new UnsupportedOperationException("Not supported yet.");
    }
}

