import java.util.ArrayList;
import java.util.List;

public class MachinePark {

    public static void main(String[] args) {

        List<Object> machines = new ArrayList<>();
        Locomotive locomotive1 = new Locomotive("Siemens", "Vectron", 20.0,
                Machine.EngineType.steam, Locomotive.TypeOfCarrige.cargo, 2010);
        Locomotive locomotive2 = new Locomotive("ZNTK", "EU07A", 12.0,
                Machine.EngineType.electric, Locomotive.TypeOfCarrige.passenger, 2023);
        Lawnmower lawnmower1 = new Lawnmower("Gardyer", "YYK1233", 2.0,
                Machine.EngineType.electric, false, true, 4);
        Lawnmower lawnmower2 = new Lawnmower("Lidl", "Parkside", 1.0,
                Machine.EngineType.gasoline, true, false, 2);
        Vehicle vehicle1 = new Vehicle("Volksvagen", "SuperTir", 3.5,
                Machine.EngineType.gasoline, 150, 5);
        Vehicle vehicle2 = new Vehicle("Mercedes", "AutobusX", 2.3, Machine.EngineType.diesel,
                85, 2.5);
        Car car1 = new Car("Ford", "Fiesta", 1.0, Machine.EngineType.gasoline,
                100, 3, Car.Segment.A, "FH493FKSJE$");
        Car car2 = new Car("Toyota", "Corolla", 2.0, Machine.EngineType.diesel,
                90, 2.5, Car.Segment.B, "36BJFKDS9387NFJ8");
        TwoWheeler twoWheeler1 = new TwoWheeler("Urabn GO!", "HulajDusza", "scooter");
        TwoWheeler twoWheeler2 = new TwoWheeler("KROSS", "SuperMountain", 0.5,
                Machine.EngineType.electric, 10, 3, "bicycle");

        machines.add(locomotive1);
        machines.add(locomotive2);
        machines.add(lawnmower1);
        machines.add(lawnmower2);
        machines.add(vehicle1);
        machines.add(vehicle2);
        machines.add(car1);
        machines.add(car2);
        machines.add(twoWheeler1);
        machines.add(twoWheeler2);

        // Can I do it better (easier)?
        for (Object machine : machines) {
            if (machine instanceof Locomotive)
                ((Locomotive) machine).display();
            else if (machine instanceof Lawnmower) {
                ((Lawnmower) machine).display();
            } else if (machine instanceof Vehicle) {
                ((Vehicle) machine).display();
            } else if (machine instanceof Car) {
                ((Car) machine).display();
            } else {
                ((TwoWheeler) machine).display();
            }

            // I want it to work only with this
            // machine.display();
        }

        lawnmower1.setBlades(20);
        lawnmower1.display();

//        Wrong examples
//        Locomotive locomotive3 = new Locomotive("ZNTK", "EU07A", 12.0,
//                Machine.EngineType.electric, Locomotive.TypeOfCarrige.passenger, 1800);
//        Locomotive locomotive4 = new Locomotive("ZNTK", "EU07A", 12.0,
//                Machine.EngineType.electric, Locomotive.TypeOfCarrige.passenger, 2200);
//        Lawnmower lawnmower3 = new Lawnmower("Lidl", "Parkside", 1.0,
//                Machine.EngineType.gasoline, true, false, -3);

    }
}
