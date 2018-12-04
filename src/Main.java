public class Main {

    public void changeValue(int val) {
        val = 10;
    }

    public static void main(String[] args) {
        Main t = new Main();

        int val = 5;
        t.changeValue(val);
        System.out.println(val); // ?
    }

}
