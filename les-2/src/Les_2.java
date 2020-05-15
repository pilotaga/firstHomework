import java.util.Arrays;

public class Les_2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};//first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[8];//second
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 3 * i;
            System.out.println(arr1[i]);
        }

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//third
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
            System.out.println(arr2[i]);
        }

        int[][] arr3 = new int[5][5];//forth
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if(i==j) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr4 = new int[10];//fifth
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int)(Math.random() * 100);
            System.out.println(arr4[i]);
        }
        int min = arr4[0];
        int max = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] < min) min = arr4[i];
            if(arr4[i] > max) max = arr4[i];
        }
        System.out.println(min);
        System.out.println(max);

        int array[] = {1, 2, 4, 6, 1};//sixth
        System.out.println(checkBalance(array));
        cycShift(array, -3);
        System.out.println(Arrays.toString(array));


    }

    public static boolean checkBalance(int[] arr){//sixth
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <= i; j++){
                sum1 += arr[j];
            }
            for(int j = i + 1; j < arr.length; j++){
                sum2 += arr[j];
            }
            if (sum1 == sum2) return true;
            sum1 = 0; sum2 = 0;
        }
        return false;
    }

    public static void cycShift(int[] arr, int n){//seventh
        int temp = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                temp = arr[arr.length - 1];
                for(int j = arr.length - 1; j > 0; j--){
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        } else
        {
            n = Math.abs(n);
            for (int i = 0; i < n; i++) {
                temp = arr[0];
                for(int j = 0; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }
}
