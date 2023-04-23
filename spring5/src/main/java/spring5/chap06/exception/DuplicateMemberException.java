package spring5.chap06.exception;

public class DuplicateMemberException extends RuntimeException{

    public DuplicateMemberException(String message) {
        super(message);
    }
}
