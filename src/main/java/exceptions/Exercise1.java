package exceptions;

public class Exercise1 {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        System.out.println(MathUtils.divide(8, 0));
    }
}

class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Can't divide by 0!");
    }
}

class MathUtils {

    public static float divide(int x, int y) throws CannotDivideBy0Exception {
        if (y == 0) {
            throw new CannotDivideBy0Exception();
        } else {
            return (float) x / y;
        }
    }
}
