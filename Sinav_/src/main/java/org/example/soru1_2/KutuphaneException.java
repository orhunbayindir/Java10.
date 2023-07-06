package org.example.soru1_2;

public class KutuphaneException extends Exception {

    private String message;

    public KutuphaneException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
