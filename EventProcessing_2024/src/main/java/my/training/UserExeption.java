package my.training;

public class UserExeption extends Exception {
    final static public int NO_NAME = 1;
    final static public int NO_SURNAME = 2;
    final static public int NO_EMAIL = 3;
    private int code;

    public UserExeption(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
