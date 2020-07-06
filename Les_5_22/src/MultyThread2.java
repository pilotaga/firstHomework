public class MultyThread2 implements Runnable {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private float[] arr = new float[size];
    private float[] a1 = new float[h];
    private float[] a2 = new float[h];
    private long a;
    private long b;


    public MultyThread2() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
    }

    @Override
    public void run() {
        countTime();
    }

    public void countTime() {
        a = System.currentTimeMillis();
        countArr();
        System.out.println(System.currentTimeMillis() - a);
    }

    public synchronized void countArr() {
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(() -> countHalfArr(a1));
        new Thread(() -> countHalfArr(a2));
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
    }

    public void countHalfArr(float[] arr) {
        for (int i = 0; i < h; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
