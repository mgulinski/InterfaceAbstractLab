
package lab3;

/**
 *
 * @author Machi
 */
public interface IAthlete {
    
    public abstract String getName();
    public abstract void setName(String name);
    
    public abstract int getAge();
    public abstract void setAge(int age);
    
    public abstract void canRun();
    public abstract void canJump();
    public abstract void canTrain();
    
}
