// autor: Krystyna Tokarska
// Zaimplementuj klasę Lokomotywa dziedziczącą po maszynie. Klasa ta ma dodawać dwa prywatne atrybuty
// charakterystyczne dla lokomotyw i nieuwzględnione wcześniej w maszynie. Klasa ta ma mieć konstruktor, przyjmujący
// komplet 6 parametrów oraz metodę wyswietl, wyrzucającą w zamyśle na ekran wyczerpujący opis danej lokomotywy.
public class Locomotive extends Machine {

    private TypeOfCarrige typeOfCarrige;
    private int yearOfProduction;

    public enum TypeOfCarrige {
        passenger, cargo, universal
    }

    public Locomotive(String mark, String name, double engineCapacity, EngineType engineType, TypeOfCarrige
            typeOfCarrige, int yearOfProduction) {
        super(mark, name, engineCapacity, engineType);
        this.typeOfCarrige = typeOfCarrige;

        if (yearOfProduction < 1802 || yearOfProduction > 2023) {
            throw new IllegalArgumentException("First locomotive was created in 1802, and the newest one in 2023.");
        } else {
            this.yearOfProduction = yearOfProduction;
        }
    }

    public TypeOfCarrige getTypeOfCarrige() {
        return typeOfCarrige;
    }

    public void setTypeOfCarrige(TypeOfCarrige typeOfCarrige) {
        this.typeOfCarrige = typeOfCarrige;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction < 1802 || yearOfProduction > 2023) {
            throw new IllegalArgumentException("First locomotive was created in 1802, and the newest one in 2023.");
        } else {
            this.yearOfProduction = yearOfProduction;
        }
    }

    @Override
    public void display() {
        System.out.println("This is " + this.name + " locomotive. It was created by " + this.mark + " in " +
                this.yearOfProduction + ". It's type of usage is " + this.typeOfCarrige + " train. It's " +
                "engine type is " + this.engineType + " and has " + this.engineCapacity + " capacity. If " +
                "you want to learn something else about is please check google.");
    }
}

