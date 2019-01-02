package estore.backend;

public class tooMuchQuantityException extends Exception {

    public tooMuchQuantityException() {
        super("cannotaddmore");
    }

}
