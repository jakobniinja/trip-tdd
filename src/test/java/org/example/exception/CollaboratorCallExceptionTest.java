package org.example.exception;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class CollaboratorCallExceptionTest {


  CollaboratorCallException exception = new CollaboratorCallException();

  @Test
  void onInitNotNull(){
    assertNotNull(exception);
  }
}
