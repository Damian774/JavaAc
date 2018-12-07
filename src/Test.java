public class Test {

    public static void main(String[] args){
        Vehicle [] vehicles = {new Ship(), new Train()};
        for(Vehicle v : vehicles){
            v.start();
        }
    }

}

abstract class Vehicle{
    void start(){
        startEngine();
        horn();
        move();
    }

    void move(){ System.out.println("VEHICLE MOVE"); }
    abstract void horn();
    void startEngine(){ System.out.println("ENGINE START"); }
}

class Ship extends Vehicle{
    @Override
    void horn() {System.out.println("#### SHIP SIREN SOUND"); }
}

class Train extends Vehicle{
    @Override
    void horn() {System.out.println("++++ TRAIN HORN SOUND"); }
}
