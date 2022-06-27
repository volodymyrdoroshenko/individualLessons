package lessons.lesson2.exceptions;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String str) {
        super(str);
    }
}
