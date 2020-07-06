import java.lang.reflect.Array;
import java.util.Arrays;

public class MultyThread implements Runnable {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private float[] arr = new float[size];
    private float[] a1 = new float[h];
    private float[] a2 = new float[h];
    private long a;
    private long b;

    public MultyThread() {
        for (int i = 0; i < size; i++ ){
            arr[i] = 1;
        }
    }


    @Override
    public void run() {
        count();
    }

    public synchronized void count(){
        a = System.currentTimeMillis();
        for (int i = 0; i < size; i++ ) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

}
