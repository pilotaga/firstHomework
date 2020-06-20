public class Main {

    public static void main(String[] args) {

    }

    public static void runApp(){
        String[][] Array = {
                {"2", "3", "4", "5"},
                {"1", "2", "3", "4"},
                {"5", "4", "4l", "6"},
                {"2", "3", "8", "6"}
        };

        try {
            System.out.println(processArray(Array));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int processArray(String[][] Array) throws MyArraySizeException, MyArrayDataException {
        if (!((Array.length == 4) && (Array[1].length == 4))) {
            throw new MyArraySizeException("That's not 4*4 array!");
        }
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[0].length; j++) {
                if (!isNumber(Array[i][j])) {
                    throw new MyArrayDataException(String.format("Invalid data in cell %s, %s", i, j));
                }
                sum += Integer.parseInt(Array[i][j]);
            }
        }
        return sum;
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}
