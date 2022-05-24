
package ClassOrganitation;

/**
 *
 * @author guexa
 */
public class StrongerEncapsulation {
    
    private String a;
    private String b;
    
    public void doSomething(){
        doAnotherThing();
    }
    
    private void doAnotherThing(){ }
    
    public String getA() { return a; }
}
