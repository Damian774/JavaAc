
public class Test {

    public static void main(String[] args){
        RegularShape[] shapes = new RegularShape[3];
        shapes[0] = new Triangle(1);
        shapes[1] = new Square(1);
        shapes[2] = new Circle(1);
        for (RegularShape shape: shapes) {
            shape.printShapeInfo();
        }
    }

}

 interface RegularShape {
    // metody abstrakcyjne
    double getArea();
    double getCircumference();
    // metoda z implementacja domyslna
    default void printShapeInfo() {
        String name = getClass().getSimpleName();
        double circ = getCircumference();
        double area = getArea();
        System.out.printf("%8s [circ. = %5.2f, area = %5.2f]%n",
                name, circ, area);
    }
    static void printInfo(RegularShape[] list){
        for(RegularShape shape: list) shape.printShapeInfo();
    }

}


class Triangle implements RegularShape{

    double a;
    public Triangle(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return (a*a)/2;
    }

    @Override
    public double getCircumference() {
        return 3*a;
    }
}

class Square implements RegularShape {
    double a;

    public Square(double a) {
        this.a =a;

    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getCircumference() {
        return 4*a;
    }
}

class Circle implements RegularShape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*r;
    }
}



