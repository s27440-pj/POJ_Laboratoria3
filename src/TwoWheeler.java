public class TwoWheeler extends Vehicle {
    private String type;

    public TwoWheeler(String mark, String name, double engineCapacity, EngineType engineType, double power,
                      double torque, String type) {
        super(mark, name, engineCapacity, engineType, power, torque);
        this.type = type;
    }

    public TwoWheeler(String mark, String name, String type) {
        super(mark, name);
        this.type = type;
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
