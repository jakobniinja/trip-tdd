package org.example.exception;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class CollaboratorCallExceptionTest {

  private final Throwable cause = new Throwable("some crazy cause");

  CollaboratorCallException exception = new CollaboratorCallException();


  @Test
  void onInitNotNull() {
    assertNotNull(exception);
  }

  @Test
  void onNoArgs() {
    assertNotNull(exception = new CollaboratorCallException("Construct me with no args"));
  }

  @Test
  void onThrowThrowable() {
    exception = new CollaboratorCallException(cause);
    assertNotNull(exception);
  }

  @Test
  void onThrowThrowableAndMessage() {
    exception = new CollaboratorCallException("Oops, a throwable was detected!", cause);
    assertNotNull(exception);
  }
}
