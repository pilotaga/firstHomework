public class MultyThread2  implements Runnable{
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[h];
    float[] a2 = new float[h];
    long a;
    long b;

    public float[] getArr() {
        return arr;
    }

    public MultyThread2() {
        for (int i = 0; i < size; i++ ){
            arr[i] = 1;
        }
    }

    @Override
    public void run() {
        countArr();
    }

    public void countArr(){
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(() -> countHalfArr(a1));
        new Thread(() -> countHalfArr(a2));

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println(System.currentTimeMillis() - a);
    }

    public synchronized void countHalfArr(float[] arr){
        for (int i = 0; i < h; i++ ) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
