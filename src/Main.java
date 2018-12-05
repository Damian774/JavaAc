public class Main {

    public void changeValue(A val) {
        val.setX(10);
    }

    public static void main(String[] args) {
        Main t = new Main();
        A a = new A();
        a.setX(5);
        t.changeValue(a);
        System.out.println(a.getX()); // ?
    }

    static class A{
        int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }
    }
}
