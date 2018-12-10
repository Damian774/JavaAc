public class Test {

    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("car1");
        vehicles[1] = new Car("car2");
        vehicles[2] = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Starting anonymous vehicle");
            }
        };

        Vehicle.startVehicles(vehicles);
        

    }

}




interface Vehicle{
    void start();

    static void startVehicles(Vehicle[] vehicles){
        for(Vehicle v : vehicles){
            v.start();
        }}
}

class Car implements Vehicle{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Starting car");
    }
}
