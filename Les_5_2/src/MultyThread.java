import java.lang.reflect.Array;
import java.util.Arrays;

public class MultyThread implements Runnable {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[h];
    float[] a2 = new float[h];
    long a;
    long b;

    public MultyThread() {
        for (int i = 0; i < size; i++ ){
            arr[i] = 1;
        }
    }

    public float[] getArr() {
        return arr;
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
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
    }

}
