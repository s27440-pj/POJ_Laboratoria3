public class Car extends Vehicle {
    public enum Segment {
        A, B, C, D, E, F, S, H, J, M
    }

    private Segment segment;
    private String vin;

    public Car(String mark, String name, double engineCapacity, EngineType engineType, double power,
               double torque, Segment segment, String vin) {
        super(mark, name, engineCapacity, engineType, power, torque);
        this.vin = vin;
        this.segment = segment;

    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public void display() {
        System.out.println("Vehicle " + this.vehicleNumber + " out of " + maximumVehicles);
        System.out.println("This is " + this.name + " produced by " + this.mark + ". It's engine type is " +
                this.engineType + " and has " + this.engineCapacity + " capacity. The torque of this vehicle is " +
                this.torque + " and the power is " + this.power + " horsepower. The segment of this car is " +
                this.segment + " and it's vin number is " + this.vin);
    }
}
