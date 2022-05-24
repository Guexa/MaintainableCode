
package BetterConstructors;

/**
 *
 * @author guexa
 */
class PizzaBuilder {

    private PizzaBuilder(Builder aThis) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * For this excercise you need to create constructors for ordering a pizza
     * use the builder pattern
     */
    
    static class Builder {
        
        private final int size;
        
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;
        
        Builder(int size)
        {
            this.size = size;
        }
        
        Builder cheese(boolean value)
        {
            cheese = value;
            return this;
        }
        
        Builder pepperoni(boolean value)
        {
            pepperoni = value;
            return this;
        }
        
        Builder mushrooms(boolean value)
        {
            mushrooms = value;
            return this;
        }
        
        PizzaBuilder build(){
            return new PizzaBuilder(Builder.this);
        }
    }
}
