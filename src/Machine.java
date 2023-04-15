public abstract class Machine {
    protected String mark;
    protected String name;
    protected double engineCapacity;
    protected EngineType engineType;

    protected enum EngineType {
        diesel, gasoline, gas, hybrid, steam, electric
    }


    // do I need this?
    public abstract void display();

    public Machine(String mark, String name, double engineCapacity, EngineType engineType) {
        this.mark = mark;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
    }

    public Machine(String mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}