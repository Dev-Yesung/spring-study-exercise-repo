package spring5.chap04.exception;

public class DuplicateMemberException extends RuntimeException{

    public DuplicateMemberException(String message) {
        super(message);
    }
}
