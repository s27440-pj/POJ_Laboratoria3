public class Locomotive extends Machine {
    public enum TypeOfCarrige {
        passenger, cargo, universal;
    }

    private TypeOfCarrige typeOfCarrige;
    private int yearOfProduction;

    public Locomotive(String mark, String name, double engineCapacity, EngineType engineType, TypeOfCarrige
            typeOfCarrige, int yearOfProduction) {
        this.mark = mark;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.typeOfCarrige = typeOfCarrige;

        if (yearOfProduction < 1802 || yearOfProduction > 2023) {
            throw new RuntimeException("First locomotive was created in 1802, and the newest one in 2023.");
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
            throw new RuntimeException("First locomotive was created in 1802, and the newest one in 2023.");
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

