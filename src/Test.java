public class Test {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("car1_name"),
                new Truck("truck1_name"),
                new RaceCar("racecar1_name"),
                new Ship("ship1_name"),
        new Plane("plane1_name")};

        for(Vehicle vehicle: vehicles){
            vehicle.go();
            vehicle.stop();
            System.out.println(vehicle.calculateFuelConsumption());
            if(vehicle instanceof Flying) ((Flying) vehicle).callAirControl();
        }

    }



}

