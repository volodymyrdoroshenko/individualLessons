package lessons.lesson2.exceptions;

public class Main {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        String[][] array = new String[SIZE][SIZE];
        fillArrayRandom(array);
        int sum;
        try {
            sum = ArrayValueCalculator.doCalc(array);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Sum of elements in array: " + sum);
    }

    public static void fillArrayRandom(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }
    }
}
