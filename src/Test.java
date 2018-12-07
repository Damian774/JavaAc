public class Test {

    public static void main(String[] args){
        Vehicle [] vehicles = {new SmallBoat(), new Train()};
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

abstract class Ship extends Vehicle{ }

class Train extends Vehicle{
    @Override
    void horn() {System.out.println("++++ TRAIN HORN SOUND"); }
}

class SmallBoat extends Ship{

    @Override
    void horn() {
        System.out.println("#### SMALL BOAT HORN SOUND"); }
    }

