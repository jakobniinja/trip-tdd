package org.example.exception;

public class CollaboratorCallException extends RuntimeException {

  public CollaboratorCallException() {
    //
  }

  public CollaboratorCallException(String s) {
    super(s);
  }

  public CollaboratorCallException(Throwable cause) {
    super(cause);
  }

  public CollaboratorCallException(String message, Throwable cause) {
    super(message, cause);
  }
}
