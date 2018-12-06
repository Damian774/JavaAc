public class Test {

    public static void main(String[] args) {

        Vehicle v[] = new Vehicle[4];
        v[0] = new Plane();
        v[1] = new Ship();
        v[2] = new Truck();
        v[3] = new RaceCar();
        for (int i = 0; i < v.length; i++) {
            v[i].start();
            if(v[i] instanceof RaceCar){
                RaceCar r = (RaceCar)v[i];
                r.declareType();
            }


        }

    }
}
