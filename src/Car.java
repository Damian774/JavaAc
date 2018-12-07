public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 10;
    }

    @Override
    public double getDistance() {
        return 100;
    }


}
