package lab3;

/**
 *
 * @author Machi
 */
public class Fighter extends MartialArtsPractitioner implements IFighting{
    
    private FightingStyle fightStyle;
    private String fightEvent;
    
    public Fighter() {
    
    }

   public void canRun() {
	System.out.println("I'm running like a fighter!");
    }
    
    
    public void canJump() {
	System.out.println("I'm jumping like a fighter!");
    
    }
    public void canTrain() {
	
	System.out.println("I'm traininglike a fighter!");
    
    }

    public FightingStyle getFightingStyle() {
	return fightStyle;
    }

   public void setFightingStyle(FightingStyle fightStyle) {
       this.fightStyle = fightStyle;
   
   }

    public String getFightEvent() {
	return fightEvent;
    }

    public void setFightEventDate(String fightEvent) {
	this.fightEvent = fightEvent;;
    }
    
    
}
