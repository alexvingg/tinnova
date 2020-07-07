package br.com.tinnova.demo.exception;

public class ModelNotFoundException extends IllegalArgumentException {

    public ModelNotFoundException() {
        super();
    }

    public ModelNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModelNotFoundException(String s) {
        super(s);
    }

    public ModelNotFoundException(Throwable cause) {
        super(cause);
    }

}
