public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 50;
    }

    @Override
    public double getDistance() {
        return 1000;
    }

    @Override
    public void go() {
        this.takeOff();
    }

    @Override
    public void stop() {
        this.land();
    }

    @Override
    public void takeOff() {
        System.out.println("<"+this.getClass().getName()+"> taking off");
    }

    @Override
    public void land() {
        System.out.println("<"+this.getClass().getName()+"> landing");
    }

    @Override
    public void callAirControl() {
        System.out.println("<"+this.getClass().getName()+"> calling air control");
    }
}