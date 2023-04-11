public class Vehicle extends Machine {
    protected double power;
    protected double torque;
    protected int vehicleNumber;
    public static int maximumVehicles = 12;
    public static int vehicleNumberStatic = 1;

    public Vehicle(String mark, String name, double engineCapacity, EngineType engineType, double power,
                   double torque) {
        this.mark = mark;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.power = power;
        this.torque = torque;
        if (vehicleNumberStatic >= maximumVehicles) {
            throw new RuntimeException("There can't be so many vehicles.");
        } else {
            this.vehicleNumber = vehicleNumberStatic;
            vehicleNumberStatic += 1;
        }
    }

    public Vehicle() {
        if (vehicleNumberStatic >= maximumVehicles) {
            throw new RuntimeException("There can't be so many vehicles.");
        } else {
            this.vehicleNumber = vehicleNumberStatic;
            vehicleNumberStatic += 1;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public void display() {
        System.out.println("Vehicle " + this.vehicleNumber + " out of " + maximumVehicles);
        System.out.println("This is " + this.name + " produced by " + this.mark + ". It's engine type is " +
                this.engineType + " and has " + this.engineCapacity + " capacity. The torque of this vehicle is " +
                this.torque + " and the power is " + this.power + " horsepower.");
    }
}
