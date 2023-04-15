// autor: Krystyna Tokarska
// Zaimplementuj abstrakcyjną klasę Maszyna z chronionymi atrybutami marka, nazwa, pojemnoscSilnika i rodzajSilnika.
// Ten ostatni ma być enumeracją.

// dodałam obowiązkową metodę display() aby móc w MachinePark opisać obiekty z kolekcji
// Dodałam również konstruktor aby później nie dublować

public abstract class Machine {
    protected String mark;
    protected String name;
    protected double engineCapacity;
    protected EngineType engineType;

    protected enum EngineType {
        diesel, gasoline, gas, hybrid, steam, electric
    }

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