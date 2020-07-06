public class Main {

    public static void main(String[] args) {
//        new Thread(new MultyThread()).start();
        new MultyThread().run();
        new MultyThread2().run();
//        new Thread(new MultyThread2()).start();
    }
}
