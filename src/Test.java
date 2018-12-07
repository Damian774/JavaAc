public class Test {

    public static void main(String[] args){

    }

}

class LaserJet extends Equipment implements Printer {
    @Override
    public void print() {

    }

    @Override
    public void write() {

    }
}

class Equipment{}




interface Printer extends Memory, OutputDevice {
    void print();
}
 interface OutputDevice {
    void write();
}
 interface Memory {
    void write();
}
