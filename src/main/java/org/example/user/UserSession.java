package org.example.user;

import org.example.exception.CollaboratorCallException;

public class UserSession {


  public static final UserSession userSession = new UserSession();

  private UserSession() {
    //
  }

  public static UserSession getInstance() {
    return userSession;
  }

  public User getLoggedUser() {
    throw new CollaboratorCallException("Don't call getLogged in unit test");
  }
}
