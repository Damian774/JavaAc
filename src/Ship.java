public class Ship extends Vehicle implements Sailing {
    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 30;
    }

    @Override
    public double getDistance() {
        return 100;
    }


    @Override
    public void stop() {
        dock();
    }

}