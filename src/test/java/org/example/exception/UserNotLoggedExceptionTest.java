package org.example.exception;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class UserNotLoggedExceptionTest {

  UserNotLoggedException notLoggedException = new UserNotLoggedException();

  @Test
  void onInitNotNull() {
    assertNotNull(notLoggedException);
  }

}
