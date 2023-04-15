// autor: Krystyna Tokarska
// Uzupełnij repozytorium o klasę Kosiarka, która: - dziedziczy z maszyny; - wprowadza prywatne atrybuty czyMelekser
// (typu boolean), czyNaped(j.w.) i liczbaOstrzy (typu int); - posiada, analogicznie jak klasa Kosiarka, jeden
// konstruktor i metodę wyswietl, która wyświetla komplet 7 atrybutów w zorganizowanej formie; - dodatkowo, klasa ma
// zawierać metody set dla wszystkich trzech nowowprowadzanych atrybutów.

public class Lawnmower extends Machine {
    private boolean isBlender;
    private boolean isPropultion;
    private int blades;

    public Lawnmower(String mark, String name, double engineCapacity, EngineType engineType, boolean isBlender,
                     boolean isDrive, int blades) {
        super(mark, name, engineCapacity, engineType);
        this.isBlender = isBlender;
        this.isPropultion = isDrive;
        if (blades < 0) {
            throw new IllegalArgumentException("There can't be a negative number of blades");
        } else {
            this.blades = blades;
        }
    }

    public boolean isBlender() {
        return isBlender;
    }

    public void setBlender(boolean blender) {
        this.isBlender = blender;
    }

    public boolean isPropultion() {
        return isPropultion;
    }

    public void setPropultion(boolean propultion) {
        this.isPropultion = propultion;
    }

    public int getBlades() {
        return blades;
    }

    public void setBlades(int blades) {
        if (blades < 0) {
            throw new IllegalArgumentException("There can't be a negative number of blades");
        } else {
            this.blades = blades;
        }
    }


    @Override
    public void display() {
        String isBlender;
        String isDrive;
        if (this.isBlender) {
            isBlender = " has a ";
        } else {
            isBlender = " doesn't have a ";
        }

        if (this.isPropultion) {
            isDrive = " has a ";
        } else {
            isDrive = " doesn't have a ";
        }

        System.out.println("This is " + this.name + " lawnmower, produced by " + this.mark + ". It's engine type is "
                + this.engineType + " and has " + this.engineCapacity + " capacity. " + this.name + isDrive + "drive and it" +
                isBlender + "blender. It has " + this.blades + " blades. If you want to know something else " +
                "about this lawnmower please try to google it.");
    }
}
