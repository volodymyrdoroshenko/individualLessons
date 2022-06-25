package lessons.exceptions;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String str) {
        super(str);
    }
}
