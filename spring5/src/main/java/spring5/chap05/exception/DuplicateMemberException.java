package spring5.chap05.exception;

public class DuplicateMemberException extends RuntimeException{

    public DuplicateMemberException(String message) {
        super(message);
    }
}
