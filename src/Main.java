public class Main {

    public static void main(String[] args) {

        new MyType();
    }
}

class MyType {


    MyType(){
        System.out.println("constructor");
    }
    {
        System.out.println("code block");
    }
    static{
        System.out.println("Static block");
    }
}


