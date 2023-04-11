public class TwoWheeler extends Vehicle {
    private String type;
    private int twoWheelerNumber;
    public static int twoWheelerNumberStatic = 1;
    public static int maximumTwoWheeler = 6;

    public TwoWheeler(String mark, String name, double engineCapacity, EngineType engineType, double power,
                      double torque, String type) {
        super(mark, name, engineCapacity, engineType, power, torque);
        this.type = type;
        if (twoWheelerNumberStatic >= maximumTwoWheeler) {
            throw new RuntimeException("There can be only 6 two-wheelers defined");
        } else {
            this.twoWheelerNumber = twoWheelerNumberStatic;
            twoWheelerNumberStatic += 1;
        }
    }

    public TwoWheeler(String mark, String name, String type) {
        super();
        this.mark = mark;
        this.name = name;
        this.type = type;
        if (twoWheelerNumberStatic >= maximumTwoWheeler) {
            throw new RuntimeException("There can be only 6 two-wheelers defined");
        } else {
            this.twoWheelerNumber = twoWheelerNumberStatic;
            twoWheelerNumberStatic += 1;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Vehicle " + this.vehicleNumber + " out of " + maximumVehicles);
        System.out.println("This is two-wheeler number " + this.twoWheelerNumber + " out of " + maximumTwoWheeler);
        if (engineType == null) {
            System.out.println("This is a " + this.type + " named " + this.name + " produced by " + this.mark + ".");
        } else {
            System.out.println("This is " + this.name + " produced by " + this.mark + " and it's a " + this.type +
                    ". It's engine type is " + this.engineType + " and has " + this.engineCapacity +
                    " capacity. The torque of this vehicle is " + this.torque + " and the power is " + this.power +
                    " horsepower.");
        }
    }
}
