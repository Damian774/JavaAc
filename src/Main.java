public class Main {

    public void changeValue(A val) {
        val.x = 10;
    }

    public static void main(String[] args) {
        Main t = new Main();
        A a = new A();
        a.x = 5;
        t.changeValue(a);
        System.out.println(a.x); // ?
    }

    static class A{
        int x;
    }
}
