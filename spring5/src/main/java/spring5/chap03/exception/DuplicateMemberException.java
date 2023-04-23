package spring5.chap03.exception;

public class DuplicateMemberException extends RuntimeException{

    public DuplicateMemberException(String message) {
        super(message);
    }
}
