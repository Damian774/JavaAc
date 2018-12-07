public class Test {

    public static void main(String[] args){
        Vehicle v1 = new Vehicle() {
            @Override
            public void start() {
                System.out.println("hello from car");
            }

        };
        useVehicle(v1);
        useVehicle(new Vehicle() {
            @Override
            public void start() {
                System.out.println("hello from car");
            }
        });

    }
    static void useVehicle(Vehicle v){
        v.start();
    }


}

interface Vehicle{
    void start();
}

