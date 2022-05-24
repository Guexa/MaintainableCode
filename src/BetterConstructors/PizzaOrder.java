
package BetterConstructors;

/**
 *
 * @author guexa
 */
public class PizzaOrder {
    
    public static void main(String[] args) {
        
        /**
         * Here you need to invoke the builder pattern
         */
        
        PizzaBuilder pizza = new PizzaBuilder.Builder(12)
                                             .cheese(true)
                                             .mushrooms(true)
                                             .pepperoni(true)
                                             .build();
        
        //Deliver Pizza
    }
    
}
