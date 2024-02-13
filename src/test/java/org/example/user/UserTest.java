package org.example.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.example.trip.Trip;
import org.example.trip.User;
import org.junit.jupiter.api.Test;

class UserTest {

  User user = new User();

  @Test
  void onInitNotNull() {
    assertNotNull(user);
  }

  @Test
  void onInitFriends0() {
    assertEquals(0, user.getFriends().size());
  }
  @Test
  void onAddFriendSize1() {
    user.addFriend(new User());

    assertEquals(1, user.getFriends().size());
  }

  @Test
  void onTripInitSize0(){
    assertEquals(0, user.getTrips());
  }

  @Test
  void onTripAddSize1(){
    user.addTrip(new Trip());
    assertEquals(1, user.getTrips());
  }

}
