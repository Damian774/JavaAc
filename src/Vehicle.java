public abstract class Vehicle {
    private String name;

    public String toString() {
        return name;
    }

    public abstract double getFuelNeeds();


    public abstract double getDistance();

    public double calculateFuelConsumption() {
        return getFuelNeeds()/getDistance();
    }

    public void go() {
        System.out.println("<"+this.getClass().getName()+"> started");
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public void stop() {
        System.out.println("<"+this.getClass().getName()+"> stopped");
    }
}
