/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Machi
 */
public interface IFighting {
    
    public abstract FightingStyle getFightingStyle();
    public abstract void setFightingStyle(FightingStyle fightStyle);
    
    public abstract String getFightEvent();
    public abstract void setFightEventDate(String fightDate);
    
}
