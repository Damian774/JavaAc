public class Plane extends Vehicle implements Flying {
    @Override
    public double getFuelNeeds() {
        return 0;
    }

    @Override
    public double getDistance() {
        return super.getDistance();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void callAirControl() {

    }
}