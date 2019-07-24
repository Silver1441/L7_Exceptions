package task1.exception;

public class FileNoLongerAvailableException extends Exception {
    String msg;
    public FileNoLongerAvailableException(String msg, Throwable cause) {
        super(cause);
        this.msg=msg;
    }
    public String getMessage(){
        return msg;
    }
}
