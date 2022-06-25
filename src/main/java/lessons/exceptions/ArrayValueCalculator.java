package lessons.exceptions;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) {
        if (!checkArraySize(array)) throw new MyArraySizeException("Invalid array size. Array size must be 4x4!");
        return sumArray(array);
    }

    public static boolean checkArraySize(String[][] array) {
        if (array.length != 4) {
            return false;
        } else {
            for (String[] strings : array) {
                if (strings.length != 4) return false;
            }
            return true;
        }
    }

    public static int sumArray(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Invalid data format at cell [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
