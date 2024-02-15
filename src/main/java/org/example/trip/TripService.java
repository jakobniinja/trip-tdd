package org.example.trip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.example.exception.UserNotLoggedException;
import org.example.user.User;

public class TripService {

  private boolean oneFriend;

  public List<Trip> getTripByUser(User user) throws UserNotLoggedException {
    ArrayList<Trip> trips = new ArrayList<>();

    for (User friend : user.getFriends()) {

      if (friend != null) {
        trips.add(new Trip());
        oneFriend = true;
        break;
      }
    }

    if (oneFriend) {
      return trips;
    }
    throw new UserNotLoggedException();
  }

  public boolean hasFriends() {
    return oneFriend;
  }
}
