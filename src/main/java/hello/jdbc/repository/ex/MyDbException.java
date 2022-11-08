package hello.jdbc.repository.ex;

public class MyDbException extends RuntimeException {

    public MyDbException() {
    }

    public MyDbException(String message) {
        super(message);
    }

    //체크 예외를 감싸기 위한 용도이므로 기존 예외를 가지고 있어야 한다.
    public MyDbException(Throwable cause) {
        super(cause);
    }

    public MyDbException(String message, Throwable cause) {
        super(message, cause);
    }
}
