package org.example.user;

public class UserSession {


  public static final UserSession userSession = new UserSession();

  private UserSession() {
    //
  }

  public static UserSession getInstance() {
    return userSession;
  }

  public User getLoggedUser() {
    throw new RuntimeException();
  }
}
