package org.example.user;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.exception.CollaboratorCallException;
import org.junit.jupiter.api.Test;

class UserSessionTest {

  @Test
  void onInitGetInstance(){
    assertNotNull(UserSession.getInstance());
  }

  @Test
  void onGetLoggedUserThrowException(){
    UserSession instance = UserSession.getInstance();
    assertThrows(RuntimeException.class, instance::getLoggedUser);
  }

  @Test
  void onGetLoggedUserThrowCollab(){
    UserSession instance = UserSession.getInstance();
    assertThrows(CollaboratorCallException.class, instance::getLoggedUser);
  }
}
