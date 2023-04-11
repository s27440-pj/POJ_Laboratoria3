public abstract class Machine {
    protected String mark;
    protected String name;
    protected double engineCapacity;

    protected enum EngineType {
        diesel, gasoline, gas, hybrid, steam, electric
    }

    protected EngineType engineType;

    // do I need this?
    public void display() {

    }
}